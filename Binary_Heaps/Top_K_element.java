package Binary_Heaps;
import java.util.*;
public class Top_K_element 
{
    public static void K_element(int arr[], int k)
    {
        TreeMap<Integer,Integer> st = new TreeMap<>(Collections.reverseOrder());
        for(int i : arr)
            st.put(i, st.getOrDefault(i,0)+1);
    PriorityQueue<Pair> pq = new PriorityQueue<>( 
                             new Comparator<Pair>() 
    { 
        public int compare(Pair p1, Pair p2) 
        { 
            return p2.value.compareTo( 
                   p1.value); 
        } 
    });
    for(Map.Entry<Integer,Integer> e : st.entrySet())
    {
        pq.add(new Pair(e.getKey(), e.getValue()));
    }
    while(pq.isEmpty()==false)
    {
        System.out.println(pq.poll().key);
    }
    }
    public static void main(String args[])
    {
        int arr[] = {4,1,-1,2,-1,2,3};
        int k = 2;
        K_element(arr, k);
    }   
}
