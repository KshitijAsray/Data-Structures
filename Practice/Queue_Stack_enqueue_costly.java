package Practice;

import java.util.Stack;
public class Queue_Stack_enqueue_costly 
{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void Enqueue_costly(int x)
    {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        s1.push(x);
        while(!s2.isEmpty())
            s1.push(s2.pop());
    }
    public int Dequeue()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is Empty");
            return Integer.MAX_VALUE;
        }
        return s1.pop();
    }
}
