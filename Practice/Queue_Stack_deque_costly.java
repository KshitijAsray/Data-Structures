package Practice;

import java.util.Stack;

public class Queue_Stack_deque_costly 
{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void Enqueue(int x)
    {
        s1.push(x);
    }
    public int Deque()
    {
        while(s1.isEmpty())
            s2.push(s1.pop());
        int ans = s1.pop();
        while(s2.isEmpty())
            s1.push(s2.pop());
        return ans;
    }
}
