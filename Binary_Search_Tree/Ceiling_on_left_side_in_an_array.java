package Binary_Search_Tree;
import java.util.TreeSet;
public class Ceiling_on_left_side_in_an_array 
{
    public static void ceiling(int arr[])
    {
        TreeSet<Integer> tt = new TreeSet<>();
        tt.add(arr[0]);
         System.out.print("-1"+" ");
        for(int i = 1;i<arr.length;i++)
        {
            if(tt.ceiling(arr[i])==null)
                System.out.print("-1"+" ");
            else
                System.out.print(tt.ceiling(arr[i])+" ");
                tt.add(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {2,8,30,15,25,12};
        ceiling(arr);
    }
}
