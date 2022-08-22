package Dynamic_programming;

public class Min_partition_to_make_palindromic_string
{
    public static void main(String args[])
    {
        String str = "qwqwqwfdgdggdjdhdjdjjdaabbvaabbvaabbhaabbbhaaddaddahgggjjjkk";
        int n = str.length();
        //int res = Min_partitions(str, 0 ,n-1);
        int res1 = Min_partitions_dp(str,n);
        System.out.println(res1);
    }
    public static boolean ispalindrome(String str,int start,int end)
    {
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static int Min_partitions(String str,int i,int j)
    {
        if(ispalindrome(str, i, j))
            return 0;
        int res = Integer.MAX_VALUE;
        for(int k  = i;k<j;k++)
            res = Math.min(res, 1+Min_partitions(str, i, k)+Min_partitions(str, k+1, j));
        return res;
    }
    public static int Min_partitions_dp(String str,int n)
    {
        int dp[][] = new int[n][n];
        for(int i = 0;i<n;i++)
            dp[i][i] = 0;
        for(int gap = 1;gap<n;gap++)
        {
            for(int i = 0;i+gap<n;i++)
            {
                int j =i+gap;
                if(ispalindrome(str, i, j))
                    dp[i][j] = 0;
                else
                {
                    dp[i][j] = Integer.MAX_VALUE;
                    for(int k = i;k<j;k++)
                        dp[i][j] = Math.min(dp[i][j], 1+dp[i][k]+dp[k+1][j]);
                }
            }
        }
        return dp[0][n-1];
    }
}