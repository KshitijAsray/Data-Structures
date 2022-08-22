package Dynamic_programming;

public class Max_sum_with_no_two_consecutive_elements 
{
    public static void main(String args[])
    {
        int arr[] = {12,23,45,56,78,89,19,37,46,25};
        int n = arr.length;
        int res = Max_Sum_dp(arr, n);
        System.out.println(res);
    }
    public static int Max_Sum(int arr[],int n)
    {
        if(n==1)
            return arr[0];
        if(n==2)
            return Math.max(arr[0], arr[1]);
        else
            return (Math.max(Max_Sum(arr, n-1), arr[n-1]+Max_Sum(arr, n-2)));
    }
    public static int Max_Sum_dp(int arr[],int n)
    {
        int dp[] = new int[n+1];
        if(n==0)
            return 0;
        if(n==1)
            return arr[0];               // Theta n auxilary space
        dp[1] = arr[0];
        dp[2] = Math.max(arr[0], arr[1]);
        for(int i = 3;i<=n;i++)
            dp[i] = Math.max(dp[i-1], arr[i-1]+dp[i-2]);
        return dp[n];
    }
    public static int Max_Sum_dp_Theta_1(int arr[],int n)
    {
        if(n==1)
            return arr[0];
        int pre_pre = arr[0];
        int pre = Math.max(arr[0],arr[1]);
        int res = pre;
        for(int i = 3;i<=n;i++)
        {
            res = Math.max(pre,pre_pre+arr[i-1]);
            pre_pre = pre;
            pre = res;
        }
        return res;
    }
}
