package Binary_Heaps;
import java.util.*;
public class K_closest_element 
{
    public static ArrayList<Integer> closest_element(int nums[], int k, int x)
    {
        PriorityQueue<Pair2> pq = new PriorityQueue<>(new Comparator<Pair2>() {
            public int compare(Pair2 p1,Pair2 p2)
            {
                return(p2.diff.compareTo(p1.diff));
            }
        });
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<k;i++)
            pq.add(new Pair2(Math.abs(nums[i]-x), i));
        for(int i = k;i<nums.length;i++)
        {
            int diff = Math.abs(nums[i]-x);
            if(pq.peek().diff>diff)
            {
                pq.poll();
                pq.add(new Pair2(diff, i));
            }
        }
        while(pq.isEmpty()==false)
        {
            arr.add(nums[pq.poll().index]);
        }
        return arr;
    }
    public static void main(String args[])
    {
        int arr[] = { 10,30,5,40,38,80,70 };
	    int x=35; int k = 3;
	    ArrayList<Integer> st  = closest_element(arr,k,x);
        for(int i : st)
            System.out.print(i+" ");
    }
}
