package Dynamic_programming;

public class Matrix_Chain_Multiplication 
{
    public static void main(String args[])
    {
        int arr[] = {20,10,30,40,50,60,70,120,89};
        int n = arr.length;
        int res = MCM(arr, 0, n-1);
        int res1 = MCM_dp(arr);
        System.out.println(res1+" "+res);
    }
    public static int MCM(int arr[],int i, int j)
    {
        if(i+1==j)
            return 0;
        int res = Integer.MAX_VALUE;
        for(int k = i+1;k<j;k++)
        {
            res = Math.min(res,MCM(arr, i, k)+MCM(arr, k, j)+arr[i]*arr[k]*arr[j]);
        }
        return res;
    }
    public static int MCM_dp(int arr[])
    {
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int i = 0;i<n-1;i++)
            dp[i][i+1] = 0;
        for(int gap = 2;gap<n;gap++)
        {
            for(int i = 0;i+gap<n;i++)
            {
                int j = i+gap;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i+1;k<j;k++)
                {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k][j]+arr[i]*arr[j]*arr[k]);
                }
            }
        }
        return dp[0][n-1];
    }
}
