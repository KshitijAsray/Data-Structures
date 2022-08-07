package Hashing;
import java.util.*;
public class pair_with_given_sum
{
    public static boolean pair(int arr[],int sum)
    {
        HashSet<Integer> h1 = new HashSet<>();
        for(int i : arr)
        {
            if(h1.contains(sum-i))
                return true;
            else
                h1.add(i);
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr1[] = {3,2,8,15,-8};
        int arr2[] = {8,3,4,2,5};
        int s1 = 20;
        int s2 = 6;
        System.out.println(pair(arr1,s1));
        System.out.println(pair(arr2,s2));
    }
}
