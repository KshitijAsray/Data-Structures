package Hashing;
import java.util.*;
public class union_array 
{
    public static int union(int arr1[],int arr2[])
    {
        HashSet<Integer> h1 = new HashSet<Integer>();
        for(int i : arr1)
            h1.add(i);
        for(int i : arr2)
            h1.add(i);
            return h1.size();
    }
    public static void main(String args[])
    {
        int arr1[] = {15,20,5,15};
        int arr2[] = {15,15,15,20,10};
        System.out.println(union(arr1,arr2));
    }
}
