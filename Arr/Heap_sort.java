package Arr;

public class Heap_sort 
{
    public static void main(String[] args)
    {
        int arr[] = {12,54,21,67,89,123,43,789,90,43};
        int n = arr.length;
        Heap_sort pb = new Heap_sort();
        pb.print(arr);
        pb.Sort(arr, n);
        pb.print(arr);
    }
    public void Sort(int arr[],int n)
    {
        Build_Heap(arr, n);
        for(int i = n-1;i>=0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            Max_Heapify(arr, i, 0);
        }
    }
    public void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
    }
    public void Max_Heapify(int arr[],int n,int x)
    {
        int lt = (2*x)+1;
        int rt = (2*x)+2;
        int largest = x;
        if(lt<n&&arr[lt]>arr[x])
            largest = lt;
        if(rt<n&&arr[rt]>arr[largest])
            largest = rt;
        if(largest!=x)
        {
            int temp = arr[largest];
            arr[largest] = arr[x];
            arr[x] = temp;
            Max_Heapify(arr, n, largest);
        }
    }
    public void Build_Heap(int arr[],int n)
    {
        int rightmostbottom = (n-2)/2;
        for(int i = rightmostbottom;i>=0;i--)
            Max_Heapify(arr, n, i);
    }
}
