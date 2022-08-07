package Binary_Heaps;
import java.util.*;
public class Merge_K_Sorted_arrays 
{
    public static ArrayList<Integer> Merge(ArrayList<ArrayList<Integer>> arr)
    {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<Triplet>();
        for(int i = 0;i<arr.size();i++)
            pq.add(new Triplet(arr.get(i).get(0), i, 0));
        while(pq.isEmpty()==false)
        {
            Triplet curTriplet = pq.poll();
            res.add(curTriplet.value);
            int vPos = curTriplet.vPos;
            int aPos = curTriplet.aPos;
            if(vPos+1<arr.get(aPos).size())
            {
                pq.add(new Triplet(arr.get(aPos).get(vPos+1), aPos, vPos+1));
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
	
    ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(10); 
        a1.add(20);
        a1.add(30);
        arr.add(a1); 
  
        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(5);
        a2.add(15);
        arr.add(a2); 
  
        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(1); 
        a3.add(9); 
        a3.add(11);
        a3.add(18);
        arr.add(a3);
        System.out.println(arr);
        ArrayList<Integer> str = Merge(arr);
        System.out.println(str);

    }
}
class Triplet implements Comparable<Triplet> 
{
    int value,aPos,vPos;
    Triplet(int value, int aPos, int vPos)
    {
        this.value = value;
        this.vPos = vPos;
        this.aPos = aPos;
    }
    public int compareTo(Triplet t)
    {
        if(value<=t.value)
            return -1;
        else
            return 1;
    }
}
