package Hashing;
import java.util.*;
public class longest_consecutive_subsequence 
{
    public static int subsquence(int arr[])
    {
        HashSet<Integer> h1 = new HashSet<>();
        for(int  i : arr)
        {
            h1.add(i);
        }
        int result = 1;
        int cur = 1;
        for(Integer i : h1)
        {
            if(h1.contains(i-1)==false)
            {
                cur = 1;
                while(h1.contains(i+cur))
                    cur++;
            }
             result = Math.max(cur, result);   
        }
        return result;
    }
    public static void main(String args[])
    {
       int arr1[] = {1,3,9,2,8,2};
       //int arr2[] = {30,10,20,30,30,40,30,40,30};
       System.out.println(subsquence(arr1));
       //System.out.println(occur(arr2,4));
       subsquence(arr1);
    }
}
