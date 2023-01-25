package Arr;

public class merge_sort
{
    public static void main(String args[])
    {
        int arr[] = {12,54,32,21,00,87,43,232};
        int n = arr.length;
        print(arr);
        Merge_sort(0, n-1, arr);
        print(arr);
    }
    public static void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void Merge_sort(int low,int high,int arr[])
    {
        if(low<high)
        {
            int mid = low +(high-low)/2;
            Merge_sort(low, mid, arr);
            Merge_sort(mid+1, high, arr);
            Sorted_Merging(low, high, mid, arr);
        }
    }
    public static void Sorted_Merging(int low ,int high,int mid,int arr[])
    {
        int left_size = mid-low+1;
        int right_size = high-mid;
        int left[] = new int[left_size];
        int right[] = new int[right_size];
        for(int i = 0;i<left_size;i++)
            left[i] = arr[low+i];
        for(int i = 0;i<right_size;i++)
            right[i] = arr[mid+1+i];
        int i = 0,j=0,k=low;
        while(i<left_size&&j<right_size)
        {
            if(left[i]<right[j])
            {
                arr[k] = left[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while(i<left_size)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<right_size)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}