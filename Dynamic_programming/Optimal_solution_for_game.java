package Dynamic_programming;

// given an array {20,5,4,6} I user is the first player and gets the first chance , I have to choice of such that the max value.
// last and start elements can be chosen only
public class Optimal_solution_for_game 
{
    public static void main(String args[])
    {
        int arr[] = {20,5,4,6,90,60,45,6,53,35,23,234,45,52,4213,2546,63424,5,8,10,29,39,84,58,6867,67,989,45,12,34,78,96,25,456321,7413687,7453,96541,0};
        int n = arr.length;
        //int res = optimal_solution(arr, n);
        int res1 = Best_Solution_dp(arr,n);
        System.out.println("Max sum is: "+" "+res1);
    }
    public static int optimal_solution(int arr[],int n) // max sum is computed which possible from the given array
    {
        int sum = 0;
        for(int i = 0;i<n;i++)
            sum += arr[i];
        return max_val(arr, 0, n-1, sum);
    }
    public static int max_val(int arr[],int i,int j,int sum) // I as player will choose the max of the two choices that is the
    {               // opponent will choose the (i^th) element or the (j^th) element and then subtract it from the main sum
        if(j==i+1)  // I will choose the max of the above choices
            return Math.max(arr[i],arr[j]); // dp solution not possible as sum will be very large for array with big elements
        return (Math.max(sum-max_val(arr, i+1, j, sum-arr[i]),sum-max_val(arr, i, j-1, sum-arr[j])));
    }
    public static int Best_Solution(int arr[],int i,int j)
    {
        if(j==i+1)
            return Math.max(arr[i], arr[j]);
         return Math.max(arr[i]+Math.min(Best_Solution(arr, i+2, j), Best_Solution(arr, i+1, j-1)),
                         arr[j]+Math.min(Best_Solution(arr, i+1, j-1), Best_Solution(arr, i, j-2)));
    }
    public static int Best_Solution_dp(int arr[],int n)
    {
        int dp[][] = new int[n][n];
        for(int i = 0;i<n-1;i++)
            dp[i][i+1] = Math.max(arr[i], arr[i+1]);
        for(int gap = 3;gap<n;gap=gap+2)
        {
            for(int i = 0;i+gap<n;i++)
            {
                int j = i+gap;
                dp[i][j] = Math.max(arr[i]+Math.min(dp[i+2][j],dp[i+1][j-1]),
                                    arr[j]+Math.min(dp[i+1][j-1],dp[i][j-2]));
            }
        }
        return dp[0][n-1];
    }
}
