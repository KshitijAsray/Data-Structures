package Extras;
public class item_pricing 
{
    public static void main(String args[])
    {
        int arr[] = {10,25,50,100,500};
        double prices[] = {27.32,23.13,21.25,18.00,15.50};
        int x = 2000;
        String ans = poi(arr, prices, x);
        System.out.println(ans);
    }
    public static String poi(int arr[],double prices[], int items)
    {
        double ans = 0.0;
        if(items<=arr[arr.length-1]&&items>arr[0])
        {
            int se = binary_search(items, arr);
            if(se==-1)
                {
                    System.out.println("ghj");
                    int ceil = ceil_Index(arr, items);
                    int floor = ceil-1;
                    ans = prices[floor]+(((prices[ceil]-prices[floor])/(arr[ceil]-arr[floor]))*(items-arr[floor]));
                }
            else
                ans = prices[se];
        }
        else
        {
            int ceil = arr.length-1;
            int floor = ceil-1;
            ans = prices[floor]+(((prices[ceil]-prices[floor])/(arr[ceil]-arr[floor]))*(items-arr[floor]));
            System.out.println(ans);
        }
        return Double.toString(ans);
    }
    public static int binary_search(int items, int arr[])
    {
        int lb = 0,ub = arr.length;
        while(lb<ub)
        {
            int mid = (lb+ub)/2;
            if(arr[mid]==items)
                return mid;
            else if(arr[mid]<items)
                lb = mid+1;
            else
                ub = mid-1;
        }
        return -1;
    }
    public static int ceil_Index(int arr[],int key)
    {
        int lb = 0,ub = arr.length;
        while(lb<ub)
        {
            int mid = lb+(ub-lb)/2;
            if(key>=arr[mid])
                lb = mid+1;
            else
                ub = mid;
        }
        return ub;
    }
}
