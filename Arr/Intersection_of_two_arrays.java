package Arr;

import java.util.ArrayList;

public class Intersection_of_two_arrays 
{
    public static void main(String args[])
    {
        int arr1[] = {2,20,20,40,60};
        int arr2[] = {10,20,20,20};
        ArrayList<Integer> res = intersection(arr1, arr2);
        System.out.println(res);
    }
    public static ArrayList<Integer> intersection(int arr1[],int arr2[])
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int m = arr1.length;
        int n = arr2.length;
        int i=0,j=0;
        while(i<m&&j<n)
        {
            if(i>0&&arr1[i]==arr1[i-1])
            {
                i++;
                continue;
            }
            if(arr1[i]<arr2[j])
                i++;
            else if(arr1[i]>arr2[j])
                j++;
            else
            {
                arr.add(arr1[i]);
                i++;
                j++;
            }    
        }
        return arr;
    }
}
