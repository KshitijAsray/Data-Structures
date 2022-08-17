package Dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;

public class Minimum_jumps_to_reach_end 
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,4,0,0,2,1,2,1));
        System.out.println(arr);
        int n = arr.size();
        int res = get_min_jumps_dp(arr, n);
        System.out.println("Minimum Jumps are : "+res);
    }
    public static int get_min_jumps(ArrayList<Integer> arr,int n)
    {
        if(n==1)
            return 0;
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<=n-2;i++)
        {
            if(i+arr.get(i)>=n-1)
            {
                int sub_res = get_min_jumps(arr, i+1);
                if(sub_res!=Integer.MAX_VALUE)
                    res = Math.min(res, sub_res+1);
            }
        }
        return res;
    }
    public static int get_min_jumps_dp(ArrayList<Integer> arr, int n)
    {
        int dp[] = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1;i<n;i++)
        {
            for(int j = 0;j<i;j++)
            {
                if(j+arr.get(j)>=i)
                {
                    if(dp[j]!=Integer.MAX_VALUE)
                    {
                        dp[i] = Math.min(dp[i],dp[j]+1);
                        break;
                    }
                }
            }
        }
        return dp[n-1];
    }
}
