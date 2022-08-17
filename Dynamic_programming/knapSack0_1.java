package Dynamic_programming;

public class knapSack0_1 
{
    public static void main(String args[])
    {
        int val[] = {10,40,30,50};
        int wt[] = {5,4,6,3};
        int w = 10;
        int n = wt.length;
        int max_val = knapSack_dp(val, wt, w, n);
        System.out.println(max_val);
    }
    public static int knapSack(int val[],int wt[],int w,int n)
    {
        if(n==0||w==0)
            return 0;
        if(wt[n-1]>w)
            return knapSack(val, wt, w, n-1);
        else
            return (Math.max(knapSack(val, wt, w, n-1), val[n-1]+knapSack(val, wt, w-wt[n-1], n-1)));
    }
    public static int knapSack_dp(int val[],int wt[],int w,int n)
    {
        int dp[][] = new int[n+1][w+1];
        for(int i = 0;i<w+1;i++)
            dp[0][i] = 0;
        for(int i = 0;i<n+1;i++)
            dp[i][0] = 0;
        for(int i = 1;i<n+1;i++)
        {
            for(int j = 1;j<w+1;j++)
            {
                if(wt[i-1]>j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j], val[i-1]+dp[i-1][j-wt[i-1]]);
            }
        }
        return dp[n][w];
    }    
}
