package Dynamic_programming;

public class Allocate_minimum_pages 
{
    public static void main(String args[])
    {
        int arr[] = {10,20,30,40};
        int s = 3;
        int n = arr.length;
        int res = minimum_pages_dp(arr, s, n);
        System.out.println(res);
    }
    public static int minimum_pages(int arr[],int s,int n)
    {
        if(s==1)
            return sum_array(arr, 0, n-1);
        if(n==1)
            return arr[0];
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++)
            res = Math.min(res, Math.max(sum_array(arr, i, n-1), minimum_pages(arr,s-1 , i)));
        return res;
    }
    public static int sum_array(int arr[],int b,int e)
    {
        int sum = 0;
        for(int i = b;i<=e;i++)
            sum += arr[i];
        return sum;
    }
    public static int minimum_pages_dp(int arr[],int s,int n)
    {
        int dp[][] = new int[s+1][n+1];
        for(int i = 1;i<=n;i++)
            dp[1][i] = sum_array(arr, 0, i-1);
        for(int i = 1;i<=s;i++)
            dp[i][1] = arr[0];
        for(int i = 2;i<=s;i++)
        {
            for(int j = 2;j<=n;j++)
            {
                int res = Integer.MAX_VALUE;
                for(int p = 1;p<j;p++)
                {
                    res = Math.min(res,Math.max(dp[i-1][p], sum_array(arr, p, j-1)));
                }
                dp[i][j] = res;
            }
        }
        return dp[s][n];
    }
}
