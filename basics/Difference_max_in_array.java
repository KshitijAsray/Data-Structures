package basics;

public class Difference_max_in_array 
{
    public static void main(String args[])
    {
        int arr[] = {7,9,5,6,3,2};
        difference(arr);
    }
    public static int difference(int arr[])
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = n-1;i>=0;i--)
        {
            max = Math.max(max,arr[i]);
            if(max>arr[i])
            ans = Math.max(ans,max-arr[i]);
        }
        return ans;
    }
}
