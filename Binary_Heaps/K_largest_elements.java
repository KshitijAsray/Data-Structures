package Binary_Heaps;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;
public class K_largest_elements 
{
    public static void K_largest(int arr[],int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Stack<Integer> st = new Stack<>();
        for(int i: arr)
            pq.add(i);
        for(int i = 1;i<=k;i++)
        {
            st.add(pq.poll());
        }
        while(st.isEmpty()==false)
            System.out.print(st.pop()+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {5,15,10,20,8};
        int k[] = {2,3};
        int arr1[] = {8,6,4,10,9};
        K_largest(arr, k[0]);
        K_largest(arr1, k[1]);
    }
}
