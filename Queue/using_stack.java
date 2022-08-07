package Queue;
import java.util.*;
public class using_stack 
{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    int size;
    using_stack()
    {
        size = 0;
    }
    int size()
    {
        return size;
    }
    void enQueue(int x)
    {
        size++;
        while(st2.isEmpty()==false)
            st1.push(st2.pop());
        st2.push(x);
        while(st1.isEmpty()==false)
            st2.push(st1.pop());
    }
    int deQueue()
    {
        return st2.pop();
    }
    int peek()
    {
        return st2.peek();
    }
    boolean isEmpty()
    {
        return (size==0)? true:false;
    }
}
