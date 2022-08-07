package Queue;
import java.util.*;
public class queue_reverse_recursive 
{
    public static void main(String args[])
    { 
        Queue<Integer> q1 = new LinkedList<>();
        int  j = 0;
        while(j<=10)
        {
            q1.add(j*10);
            j++;
        }
        System.out.println("ORIGINAL QUEUE");
        System.out.println(q1);
        reverse(q1);
        System.out.println("REVERSED QUEUE");
        System.out.println(q1);
    }
    static void reverse(Queue<Integer> q1)
    {
        if(q1.isEmpty()==true)
            return;
        int d = q1.remove();
        reverse(q1);
        q1.add(d);
    }

}
