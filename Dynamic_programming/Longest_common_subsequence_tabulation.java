package Dynamic_programming;

public class Longest_common_subsequence_tabulation 
{
    public static void main(String args[])
    {
        String s1 = "AAAAXYZ";
        String s2 = "BAAAAAZ";
        int res = LCS_tabulation(s1, s2, s1.length(), s2.length());
        System.out.println(res);
    }
    static int dp[][];
    public static int LCS_tabulation(String s1,String s2,int m, int n)
    {
       dp = new int[m+1][n+1];
       for(int i = 0;i<=m;i++)
            dp[0][i] = 0;
        for(int i = 0;i<=n;i++)
            dp[i][0] = 0;
       for(int i = 1;i<=m;i++)
       {
            for(int j = 1;j<=n;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
       }
       return dp[m][n];
    }
}
