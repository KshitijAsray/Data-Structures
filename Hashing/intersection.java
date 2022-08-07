package Hashing;
import java.util.*;
public class intersection 
{
    public static int intersection_array(int arr1[],int arr2[])
    {
        HashSet<Integer> h1 = new HashSet<Integer>();
        int ans = 0;
        for(int i :arr1)
        {
            h1.add(i);
        }
        for(int i : arr2)
        {
            if(h1.contains(i))
            {
                System.out.println(h1);
                ans++;
                h1.remove(i);
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        int arr1[] = {10,20,10,30};
        int arr2[] = {20,10,10,40};
        System.out.println(intersection_array(arr1,arr2));
    }
}
