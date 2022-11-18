package Arr;


public class Merge_two_sorted_arrays 
{
    public static void main(String args[])
    {
        int arr1[] = {10,20,50};
        int arr2[] = {1,6,23,43,90};
        int m = arr1.length;
        int n = arr2.length;
        sorted_merging(arr1, arr2, m, n);
    }
    public static void sorted_merging(int arr1[],int arr2[],int m,int n)
    {
        int i = 0,j=0;
        while(i<m&&j<n)
        {
            if(arr1[i]<arr2[j])
            {
                System.out.print(arr1[i]+" ");
                i++;
            }
            else
            {
                System.out.print(arr2[j]+" ");
                j++;
            }
        }
        if(j!=n)
            print(arr2, j, n-1);
        if(i!=m)
            print(arr1, i, m-1);
    }
    public static void print(int arr[],int b,int e)
    {
        for(int i = b;i<=e;i++)
            System.out.print(arr[i]+" ");
    }
}
