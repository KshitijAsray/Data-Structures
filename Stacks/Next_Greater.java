package Stacks;
import java.util.*;
public class Next_Greater 
{
    public static void main(String[] args)
    {
        int arr[] = {5,15,10,8,6,12,9,18};
        Next_Greater_Element(arr);
    }
    public static int[] array_reversal(int arr1[])
    {
        int arr2[] = new int[arr1.length];
        int j = 0;
        for(int i = arr1.length-1;i>=0;i--)
        {
            arr2[j] = i;
            j++;
        }
        return arr2;
    }  
    public static void Next_Greater_Element(int arr[])
    {
        int arr1[] = array_reversal(arr);
        int arr3[] = new int[arr1.length];
        int j = 0;
        Stack<Integer> st = new Stack<Integer>();
        st.add(arr1[0]);
        for(int i = 0;i<arr1.length;i++)
        {
            while(st.isEmpty()==false&&st.peek()<=arr1[i])
            {
                st.pop();
            }
            arr3[j] = st.isEmpty()? -1 : st.peek();
            System.out.print(arr3[i]+" ");
            j++;
            st.push(arr1[i]);
        }
        /*for(int i = arr3.length-1;i>=0;i--)
        {
            System.out.print(arr3[i]+" ");
        }*/
    } 
}
