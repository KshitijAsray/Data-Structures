package Dynamic_programming;

import java.util.Arrays;

public class Minimum_coins 
{
    public static void main(String args[])
    {
        int nums[] = {1,2,5};
        int sum = 25;
        int res = get_minimum_dp(nums, sum);
        System.out.println("Minimum Coins : "+res);
    }
    public static int get_minimum(int coins[],int sum)
    {
        if(sum==0)
            return 0;
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<coins.length;i++)
        {
            if(coins[i]<=sum)
            {
                int sub_res = get_minimum(coins, sum-coins[i]);
                if(sub_res!=Integer.MAX_VALUE)
                    res = Math.min(res,sub_res+1);
            }
        }
        return res;
    }
    public static int get_minimum_dp(int coins[],int sum)
    {
        int n = coins.length;
        int dp[] = new int[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1;i<=sum;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(coins[j]<=i)
                {
                    int sub_res = dp[i-coins[j]];
                    if(sub_res!=Integer.MAX_VALUE)
                        dp[i] = Math.min(dp[i],sub_res+1);
                }
            }
        }
        return dp[sum];
    }
}
