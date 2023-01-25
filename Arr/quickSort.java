package Arr;
public class quickSort 
{
    public static void main(String args[])
    {
        int arr[] = {12,43,122,432,56,87,23,121,99,345};
        int n = arr.length;
        print(arr);
        Sort(0, n-1, arr);
        print(arr);
    }
    public static int lomuto_partition(int low,int high,int arr[])
    {
        int i = low-1;
        int pivot = arr[high];
        for(int j = low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static int Hoare_partition(int low,int high,int arr[])
    {
        int pivot = arr[low];
        int i = low-1,j=high+1;
        int u = 0;
        while(u!=1)
        {
            do
            {
                i++;
            }while(arr[i]<pivot);
            do
            {
                j--;
            }while(arr[j]>pivot);
            if(i>=j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
        }
        return 0;
    }
    public static void Sort(int low,int high,int arr[])
    {
        if(low<high)
        {
            int pivot = lomuto_partition(low, high, arr);
            Sort(low, pivot-1, arr);
            Sort(pivot+1,high,arr);
        }
    }
    public static void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
    }
}
