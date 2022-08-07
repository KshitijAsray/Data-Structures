package Binary_Heaps;
public class Heap_Sort 
{
    public static void Build_Max_Heap(int arr[])
    {
        int size = arr.length;
        int right_most_bottom_element = ((size/2)-1);
        for(int i = right_most_bottom_element;i>=0;i--)
        {
            Max_Heapify(i,size,arr);
        }
    }
    public static void Build_Min_Heap(int arr[])
    {
        int size = arr.length;
        int right_most_bottom_element =((size/2)-1);
        for(int i = right_most_bottom_element;i>=0;i--)
        {
            Min_Heapify(i,size,arr);
        }
    }
    public static void Max_Heapify(int i, int size,int arr[])
    {
        int lh = 2*i+1;
        int rh = 2*i+2;
        int largest = i;
        if(lh<size&&arr[lh]>arr[largest])
            largest = lh;
        if(rh<size&&arr[rh]>arr[largest])
            largest = rh;
        if(largest!=i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            Max_Heapify(largest,size,arr);
        }
    }
    public static void Min_Heapify(int i,int size,int arr[])
    {
        int lh = 2*i+1;
        int rh = 2*i+2;
        int smallest = i;
        if(lh<size&&arr[lh]<arr[smallest])
            smallest = lh;
        if(rh<size&&arr[rh]<arr[smallest])
            smallest = rh;
        if(smallest!=i)
        {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            Min_Heapify(smallest,size,arr);
        }
    }
    public static int[] Ascending_Heap_Sort(int arr[])
    {
        int size = arr.length;
        Build_Max_Heap(arr);
        for(int i = size-1;i>0;i--)
        {
            int temp = arr[0];
            arr[0]= arr[i];
            arr[i] = temp;
            Max_Heapify(0, i, arr);
        }
        return arr;
    }
    public static int[] Desending_Heap_Sort(int arr[])
    {
        int size = arr.length;
        Build_Min_Heap(arr);
        for(int i = size-1;i>0;i--)
        {
            int temp = arr[0];
            arr[0]= arr[i];
            arr[i] = temp;
            Min_Heapify(0, i, arr);
        }
        return arr;
    }
    public static void Print(int arr[])
    {
        for(int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }
}
