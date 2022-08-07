package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class stack_using_queue<T>
{
    Queue<T> q1 = new LinkedList<>();
    Queue<T> q2 = new LinkedList<>();
    T top()
    {
        return q1.peek();
    }
    int size()
    {
        return q1.size();
    }
    T pop()
    {
        return q1.remove();
    }
    void push(T x)
    {
        q2.add(x);
            while(q1.isEmpty()==true)
            {
                q2.add(q1.remove());
            }
            q1.add(x);
            while(q2.isEmpty()==false)
            {
                q1.add(q2.remove());
            }
    }
}
