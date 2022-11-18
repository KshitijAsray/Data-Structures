package Arr;
import java.util.*;
public class majority_element 
{
    public static void main(String args[])
    {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        int res = majorityElement(arr);
        System.out.println(res);

    }
    public static int majorityElement(final List<Integer> A) 
    {
        if(A.size()==1)
            return A.get(0);
        int freq = A.size()/2,l=0;
            HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i : A)
            map.put(i,map.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> k : map.entrySet())
        {
            if(k.getValue()>=freq)
            {
                l = k.getKey();
                break;
            }
        }
        return l;
    }
}
