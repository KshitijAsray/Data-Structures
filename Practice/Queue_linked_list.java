package Practice;
public class Queue_linked_list<T>
{
    Node<T> head;
    int size;
    Node<T> front,rear;
    Queue_linked_list()
    {
        size = 0;
        head = null;
        front = null;
        rear = null;
    }
    public boolean isEmpty()
    {
        if(size==0)
            return true;
        return false;
    }
    
}
