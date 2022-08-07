package Queue;
import java.util.*;
public class queue_reverse_iterative 
{
    public static void main(String args[])
    {
        Queue<Integer> q1 = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int  j = 0;
        while(j<=10)
        {
            q1.add(j);
            j++;
        }
        System.out.println("ORIGINAL QUEUE");
        System.out.println(q1);
        while(q1.isEmpty()==false)
            st.add(q1.remove());
        while(st.isEmpty()==false)
            q1.add(st.pop());
        System.out.println("REVERSED QUEUE");
        System.out.println(q1);
    }
}
