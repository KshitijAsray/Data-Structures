package basics;

public class trapping_rain_water 
{
    public static void main(String args[])
    {
        int arr[] = {8,8,2,4,5,5,1};
        int n = arr.length;
        int res = rain_water(arr, n);
        System.out.println(res);
    }
    public static int rain_water(int arr[],int n)
    {
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i = 1;i<n;i++)
        {
            if(arr[i]>left[i-1])
                left[i] = arr[i];
            else
                left[i] = left[i-1];
        }
        for(int i = n-2;i>=0;i--)
        {
            right[i] = Math.max(right[i+1],arr[i]);
        }
        print(left);
        System.out.println();
        print(right);
        // int res = 0;
        // for(int i = 0;i<n;i++)
        //     res = res + Math.min(left[i], right[i])-arr[i];
        // return res;
        return 0;
    }
    public static void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i+" ");
    }
}
