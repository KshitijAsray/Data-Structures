package Binary_Heaps;

public class Min_Heap 
{
    public static int arr[];
    public static int cap,size;
    public  Min_Heap(int cap)
    {
        Min_Heap.cap = cap;
        arr = new int[cap];
        size = 0;
    }
    public static int left(int left)
    {
        return(2*left+1);
    }
    public static int right(int right)
    {
        return(2*right+2);
    }
    public static int parent(int parent)
    {
        int p = (int)((parent-1)/2);
        return p;
    }
    public static void swap(int first,int second)
    {
        int temp = first;
        first = second;
        second = temp;
    }
    public static void insert(int x)
    {
        if(size==cap)
            return;
        size++;
        arr[size-1] = x;
        for(int i = size-1;i>=0&&arr[parent(i)]>arr[i];)
        {
            swap(arr[i],arr[parent(i)]);
            i = parent(i);
        }
    }
    public static void Min_Heapify(int i)
    {
        int lh = left(i);
        int rh = left(i);
        int smallest = i;
        if(lh<size&&arr[lh]<arr[i])
            smallest = lh;
        if(rh<size&&arr[rh]<arr[i])
            smallest = rh;
        if(smallest!=i)
        {
            swap(arr[i], arr[smallest]);
            Min_Heapify(smallest);
        }
    }
    public static int Extract_Min()
    {
        if(size==0)
            return Integer.MAX_VALUE;
        if(size==1)
        {
            size--;
            return arr[0];
        }
        swap(arr[0], arr[size-1]);
        size--;
        Min_Heapify(0);
        return arr[size];
    }
    public static void Decrease_Key(int i, int x)
    {
        arr[i] = x;
        while(i>=0&&arr[i]<arr[parent(i)])
        {
            swap(arr[i], arr[parent(i)]);
            i = parent(i);
        }
    }
    public static int Delete(int i)
    {
        int x = arr[i];
        Decrease_Key(i, Integer.MIN_VALUE);
        Extract_Min();
        return x;
    }
    public static void Build_Heap(int arr[])
    {
        int last_element = size-1;
        int right_most_bottom_element = (last_element-1)/2;
        for(int i = right_most_bottom_element;i>=0;i--)
        {
            Min_Heapify(i);
        }
    }
}
