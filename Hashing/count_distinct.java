package Hashing;
import java.util.*;
public class count_distinct 
{
    
    public static int count_distinct_elements(ArrayList<Integer> h2)
    {
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i = 0;i<h2.size();i++)
        {
            h.add(h2.get(i));
        }
        return h.size();
    }
    public static int count(Integer arr[])
    {
        HashSet<Integer> h1 = new HashSet<>(Arrays.asList(arr));
        return h1.size();
    }
    public static void main(String args[])
    {
        ArrayList<Integer> h = new ArrayList<Integer>(7);
        Integer arr[] = {12,23,34,12,34,56,678,55,43};
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the elements");
        while(ob.hasNextInt())
        {
            h.add(ob.nextInt());
        }
        ob.close();
        System.out.println(count_distinct_elements(h));
        System.out.println(count(arr));
    }
}
