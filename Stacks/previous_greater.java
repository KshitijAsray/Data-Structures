package Stacks;
import java.util.*;
public class previous_greater 
{
    public static void previous_greater_element(int arr[])
    {
        Stack<Integer> st = new Stack<Integer>();
        st.add(arr[0]);
        for(int i = 0;i<arr.length;i++)
        {
            while(st.isEmpty()==false&&st.peek()<=arr[i])
            {
                st.pop();
            }
            int pg = st.isEmpty()? -1 : st.peek();
            System.out.println(pg);
            st.push(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int arr1[] = {20,30,10,5,15};
        previous_greater_element(arr1);
    }
}
