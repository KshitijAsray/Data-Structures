package Dynamic_programming;

public class no_coins 
{
    static int dp[][];
    public static void main(String args[])
    {
        int coins[] = {5 ,6 ,7 ,9 ,11 ,12 ,13 ,15};
        int sum = 9;  //5000 14.62 sec
        int n = coins.length;
        int res = no_of_ways_dp(coins, sum, n);
        System.out.println(res);
    }  
    public static int no_of_ways(int coins[],int sum,int n)
    {
        if(sum==0)
            return 1;
        if(n==0)
            return 0;
        int res = no_of_ways(coins, sum, n-1); // when sum is not possible using the given coin or the given coin is greater than the sum
        if(coins[n-1]<=sum) // when creating sum is possible using the coins
            res = res + no_of_ways(coins, sum-coins[n-1],n);
        return res;
    }
    public static int no_of_ways_dp(int coins[],int sum,int n)
    {
        dp = new int[sum+1][n+1];
        for(int i = 0;i<=sum;i++)
            dp[i][0] = 0;
        for(int i = 1;i<=n;i++)
            dp[0][i] = 1;
        for(int i = 1;i<=sum;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                dp[i][j] = dp[i][j-1];
                if(coins[j-1]<=i)
                    dp[i][j] += dp[i-coins[j-1]][j];
            }
        }
        return dp[sum][n];
    }
}
