package Stacks;
import linkedlist.Node;
public class Stack_linked 
{
    int size;
    Node<Integer> head;
    Stack_linked()
    {
        head = null;
        size = 0;
    }
    void push(int x)
    {
        Node<Integer> temp = new Node<Integer>(x);
        head = temp;
        temp.next = head;
        head = temp;
        size++;
    }
    int pop()
    {
        if(head==null)
        {
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }
    boolean isempty()
    {
        if(head==null)
            return true;
        else    
            return false;
    }
    int peek()
    {
        if(head==null)
            return Integer.MAX_VALUE;
        return head.data;
    }
}
