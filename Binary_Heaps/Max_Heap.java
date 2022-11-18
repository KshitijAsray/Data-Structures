package Binary_Heaps;

public class Max_Heap
{
    int cap;
    int size;
    int arr[];
    Max_Heap(int cap)
    {
        this.cap = cap;
        this.size = 0;
        arr = new int[cap];
    }
    public int left(int i)
    {
        return (int)((2*i)+1);
    }
    public int right(int i)
    {
        return (int)((2*i)+2);
    }
    public int parent(int i)
    {
        return (int)((i-1)/2);
    }
    public void Max_heapify(int i)
    {
        int lt = left(i);
        int rt = right(i);
        int large = i;
        if(lt<size&&arr[lt]>arr[i])
            large = lt;
        if(rt<size&&arr[rt]>arr[large])
            large = rt;
        if(large!=i)
        {
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
            Max_heapify(large);
        }
    }
    public void insert(int x)
    {
        if(size==cap)
        {
            System.err.println("Heap is full");
            return;
        }
        size++;
        arr[size-1] = x;
        for(int i = size-1;i>=0&&arr[parent(i)]<arr[i];)
        {
            int temp = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = temp;
            i = parent(i);
        }   
    }
    public int Extract_Max()
    {
        if(size==0)
            return Integer.MAX_VALUE;
        if(size==1)
        {
            size--;
            return arr[0];
        }
        int max = arr[0];
        arr[0] = arr[size-1];
        arr[size-1] = max;
        size--;
        Max_heapify(0);
        return max;
    }
    public void Decrease_Key(int i,int x)
    {
        arr[i] = x;
        for(int j = i;j>=0&&arr[parent(i)]<arr[i];)
        {
            int temp = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = temp;
            i = parent(i);
        }
    }
    public void Delete(int index)
    {
        Decrease_Key(index, Integer.MAX_VALUE);
        Extract_Max();
    }
    public void print()
    {
        for(int i = 0;i<size;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public void Build_Heap(int arr1[])
    {
        for(int i = (size-2)/2;i>=0;i--)
            Max_heapify(i);
        for(int i : arr1)
            System.out.print(i+" ");
    }  
}
