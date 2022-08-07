package Binary_Heaps;
import java.util.PriorityQueue;
public class Sort_K_Sorted_array 
{
    public static int[] Sort_array(int arr[],int k)
    {
        PriorityQueue<Integer> mintegers = new PriorityQueue<>();
        for(int i = 0;i<=k;i++)
            mintegers.add(arr[i]);
        int index = 0;
        for(int i = k+1;i<arr.length;i++)
        {
            arr[index++] = mintegers.poll();
            mintegers.add(arr[i]);
        }
        while(mintegers.isEmpty()==false)
        {
            arr[index++] = mintegers.poll();
        }
        return arr;
    }
    public static void main(String args[])
    {
        int arr[] = {9,8,7,19,18};
        int k = 2;
        Sort_array(arr, k);
        Binary_Heaps.Heap_Sort.Print(arr);
    }
}
