package Practice;

public class heap_sort 
{
    public static void main(String args[])
    {
        int arr[] = new int[100];
        for(int i = 100-1;i>=0;i--)
            arr[i] = i;
        int size = arr.length;
        System.out.println(size);
        heap_sort ob = new heap_sort();
        ob.print(arr);
        ob.Build_Heap(arr, size);
        ob.print(arr);
        ob.sort(arr, size);
        ob.print(arr);
    }
    public void sort(int arr[],int n)
    {
        for(int i = n-1;i>=0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            Max_Heapify(arr, i, 0);
            
        }
    }
    public void Max_Heapify(int arr[],int n,int i)
    {
        int lh = (2*i)+1;
        int rh = (2*i)+2;
        int large = i;
        if(lh<n&&arr[lh]>arr[i])
            large = lh;
        if(rh<n&&arr[rh]>arr[large])
            large = rh;
        if(large!=i)
        {
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
            Max_Heapify(arr, n, large);
        }
    }
    public void Build_Heap(int arr[],int n)
    {
        int right = (n-2)/2;
        for(int i = right;i>=0;i--)
            Max_Heapify(arr, n, i);
    }
    public void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
    }
}
