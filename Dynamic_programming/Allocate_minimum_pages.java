package Dynamic_programming;

public class Allocate_minimum_pages 
{
    public static void main(String args[])
    {
        int arr[] = {10,5,30,1,2,5,10,10,78,32,8,12,32,43,57};
        int s = 5;
        int n = arr.length;
        int res = minimum_pages(arr, s, n);
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
}
