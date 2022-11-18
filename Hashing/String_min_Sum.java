package Hashing;
import java.util.*;
  //Paolo Alto Roy and Strings
public class String_min_Sum 
{
    public static void main(String args[])
    {
        int arr[] = {9,4,5,6,7};
        String str = "auvak";
        int len = str.length();
        System.out.println(get_min(arr, str, len));
    }
    public static int get_min(int arr[],String str,int len)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<len;i++)
            map.put(str.charAt(i),Integer.MIN_VALUE);
        int whole_sum = 0;
        for(int i = 0;i<len;i++)
            whole_sum += arr[i];
        for(int i = 0;i<len;i++)
        {
            if(map.get(str.charAt(i))<arr[i])
                map.put(str.charAt(i),arr[i]);
        }
        int max_sum = 0;
        for(Map.Entry<Character,Integer> i : map.entrySet())
            max_sum +=i.getValue();
        return whole_sum-max_sum;
    }
}
