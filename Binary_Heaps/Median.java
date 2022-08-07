package Binary_Heaps;
import java.util.*;
public class Median 
{
    public static ArrayList<Double> Median_Stream(int arr[])
    {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Double> res = new ArrayList<>();
        max.add(arr[0]);
        res.add((double)arr[0]);
        for(int i = 1;i<arr.length;i++)
        {
            int x = arr[i];
            if(max.size()>min.size())
            {
                if(x<max.peek())
                {
                    min.add(max.poll());
                    max.add(x);
                }
                else
                    min.add(x);
                res.add(((double)(max.peek()+min.peek())/2));
            }
            else
            {
                if(x<=max.peek())
                    max.add(x);
                else
                {
                    min.add(x);
                    max.add(min.poll());
                }
                res.add((double)max.peek());
            }  
        }
        return res;
    }
    public static void main(String args[])
    {
        int arr[] = {12,15,10,5,8,7,16};
        ArrayList<Double> res = Median_Stream(arr);
        System.out.println(res);
    }    
}
