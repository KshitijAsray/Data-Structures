package Dynamic_programming;

public class Sum_subset_problem 
{
    public static void main(String args[])
    {
        int arr[] = {10,5,5,5,6,3,6,1,14,9,8};
        int n = arr.length;
        int sum = 15;
        int res = subset_dp(arr, n, sum);
        System.out.println(res);
    }
    public static int subset(int arr[],int n,int sum)
    {
        if(n==0)
            return (sum==0)?1:0;
        return (subset(arr, n-1, sum)+subset(arr, n-1, sum-arr[n-1]));
    }
    public static int subset_dp(int arr[], int n, int sum)
    {
        int dp[][] = new int[n+1][sum+1];
        dp[0][0] = 1;
        for(int i = 1;i<=sum;i++)
            dp[0][i] = 0;
        for(int i = 0;i<=n;i++)
            dp[i][0] = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=sum;j++)
            {
                if(j<arr[i-1])
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-arr[i-1]];
            }
        }
        return dp[n][sum];
    }
}
