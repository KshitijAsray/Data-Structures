package Practice;

public class Node<T>
{
    T val;
    Node<T> next;
    Node(T val)
    {
        this.val = val;
        next = null;
    }
}
