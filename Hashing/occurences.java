package Hashing;
import java.util.*;
public class occurences 
{
    public static HashSet<Integer> occur(int arr[],int k)
    {
        int n = arr.length;
        Integer n_k = n/k;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashSet<Integer> h1 = new HashSet<>();
        for(int i : arr)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> i : map.entrySet()) 
        {
            if(i.getValue()>n_k)
                h1.add(i.getKey());
        }
        return h1;
    }
    public static void main(String args[])
    {
        int arr1[] = {30,10,20,20,10,20,30,30};
        int arr2[] = {30,10,20,30,30,40,30,40,30};
        System.out.println(occur(arr1,4));
        System.out.println(occur(arr2,4));
    }
}
