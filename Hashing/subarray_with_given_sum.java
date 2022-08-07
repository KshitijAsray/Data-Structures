package Hashing;
import java.util.*;
public class subarray_with_given_sum 
{
    public static boolean given_sum(int arr[],int sum)
    {
        HashSet<Integer> h1 = new HashSet<>();
        int prefix_sum = 0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        int pre_sum = 0;
        for(int i : arr)
        {
            pre_sum = pre_sum + i;
            arr1.add(pre_sum);
        }
        System.out.println(arr1);
        for(int i : arr)
        {
            prefix_sum = prefix_sum+i;
            if(h1.contains(prefix_sum-sum))
                return true;
            if(prefix_sum==sum)
                return true;
            h1.add(i);
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr1[] = {-3,4,-3,-1,1};
        int arr2[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(given_sum(arr2,4));
        System.out.println(given_sum(arr1,0));
    }
}
