package Hashing;
import java.util.*;
public class frequency_elements 
{
    public static HashMap<Integer,Integer> freq(int arr[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr)
        {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        return map;
    }
    public static void main(String args[])
    {
        int arr[] = {12,23,34,45,56,67,78,12,12,34,23,45,56,78};
        HashMap<Integer,Integer> map1 = freq(arr);
        for (Map.Entry<Integer, Integer> i : map1.entrySet()) 
        {
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
