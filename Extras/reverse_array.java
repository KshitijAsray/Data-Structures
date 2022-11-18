package Extras;

public class reverse_array 
{
    public static void main(String args[])
    {
        int arr[] = {12,54,21,67,89,123,43,789,90,43};
        //int n = arr.length;
        print(arr);
        reverse(arr);
        print(arr);
    }
    public static void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void reverse(int str[])
    {
        int i = 0,j=str.length-1;
        while(i<j)
        {
            int temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}
