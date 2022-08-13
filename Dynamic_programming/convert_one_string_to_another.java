package Dynamic_programming;

public class convert_one_string_to_another 
{
    public static void main(String args[])
    {
        String s1 = "CAT";
        String s2 = "CUT";
        int res = min_no_of_ops_dp(s1, s2, s1.length(), s2.length());
        System.out.println(res);
    }
    public static int min_no_of_ops(String s1,String s2,int m, int n)
    {
        if(m==0)
            return n;
        if(n==0)
            return m;
        if(s1.charAt(m-1)==s2.charAt(n-1))
            return min_no_of_ops(s1, s2, m-1, n-1);
        else
            return 1+Math.min(min_no_of_ops(s1, s2, m, n-1),Math.min(min_no_of_ops(s1, s2, m-1, n), min_no_of_ops(s1, s2, m-1, n-1)));
    }
    static int dp[][];
    public static int min_no_of_ops_dp(String s1,String s2,int m,int n)
    {
        dp = new int[m+1][n+1];
        for(int i = 0;i<n+1;i++)
            dp[0][i] = i;
        for(int i = 0;i<m+1;i++)
            dp[i][0] = i;
        for(int i = 1;i<m+1;i++)
        {
            for(int j = 1;j<n+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = 1+Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
            }
        }
        return dp[m][n];
    }
}
