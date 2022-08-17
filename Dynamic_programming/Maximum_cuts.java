package Dynamic_programming;

import java.util.Scanner;

// A rod of size n is given we have to make cuts in the rod of given sizes a , b , c such that the no of cuts are maximum
// If no cut is possibl then return -1
public class Maximum_cuts 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the length of the rod");
        int n = ob.nextInt();
        System.out.println("Enter the size of cuts");
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();
        int res = Maximize_cuts_dp(n, a, b, c);
        System.out.println("Maximum Cuts are : "+ res);
        ob.close();
    }
    public static int Maximize_cuts_recursive(int n,int a,int b,int c)
    {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int res = Math.max(Maximize_cuts_recursive(n-a, a, b, c), 
                  Math.max(Maximize_cuts_recursive(n-b, a, b, c), 
                           Maximize_cuts_recursive(n-c, a, b, c)));
        if(res!=-1)
            return res+1;
        else
            return -1;
    }
    public static int Maximize_cuts_dp(int n,int a,int b,int c)
    {
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i = 1;i<=n;i++)
        {
            dp[i] = -1;
            if(i-a>=0)
                dp[i] = Math.max(dp[i],dp[i-a]);
            if(i-b>=0)
                dp[i] = Math.max(dp[i],dp[i-b]);
            if(i-c>=0)
                dp[i] = Math.max(dp[i],dp[i-c]);
            if(dp[i]!=-1)
                dp[i]++;
        }
        return dp[n];
    }
    public static void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i+" ");
    }
}
