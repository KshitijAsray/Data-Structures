package Arr;
import java.util.ArrayList;
public class Union_of_two_sorted_arrays 
{
    public static void main(String args[])
    {
        int arr1[] = {2,20,20,40,60};
        int arr2[] = {10,20,20,20};
        ArrayList<Integer> res = union(arr1, arr2);
        System.out.println(res);
    }
    public static ArrayList<Integer> union(int arr1[],int arr2[])
    {
        ArrayList<Integer> res = new ArrayList<>();
        int m = arr1.length;
        int n = arr2.length;
        int i = 0,j=0;
        while(i<m&&j<n)
        {
            if(i>0&&arr1[i]==arr1[i-1])
            {
                i++;
                continue;
            }
            if(j>0&&arr2[i]==arr2[j-1])
            {
                j++;
                continue;
            }
            if(arr1[i]<arr2[j])
            {
                res.add(arr1[i]);
                i++;
            }
            else if(arr2[j]<arr1[i])
            {
                res.add(arr2[j]);
                j++;
            }
            else 
            {
                res.add(arr1[i]);
                i++;
                j++;
            }
        }
        if(i<m)
            after(arr1, res, i, m);
        if(j<n)
            after(arr2, res, j, n);
        return res;
    }
    public static void after(int arr[],ArrayList<Integer> res,int i,int j)
    {
        while(i<j)
        {
            if(i>0&&arr[i]!=arr[i-1])
            {
                res.add(arr[i]);
                i++;
            }
        }
    }
}

