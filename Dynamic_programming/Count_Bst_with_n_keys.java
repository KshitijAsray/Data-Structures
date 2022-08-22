package Dynamic_programming;

import java.util.Arrays;

public class Count_Bst_with_n_keys 
{
    public static void main(String args[])
    {
        int n = 51;
        long res = Count_keys(n);
        System.out.println(res);
    }
    public static long Count_keys(int n) 
    {
        int dp[] = new int[n+1];
        Arrays.fill(dp,0);
        dp[0] = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 0;j<i;j++)
            {
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
