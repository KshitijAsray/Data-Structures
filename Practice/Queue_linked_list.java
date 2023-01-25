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
    public void add(T val)
    {
        Node<T> newNode = new Node<>(val);
        if(size==0)
        {
            head = newNode;
            rear = newNode;
            front = newNode;
            size++;
            return;
        }
        //front = head;
        rear.next = newNode;
        rear = newNode;
        size++;
        return;
    }
    public int size()
    {
        return size;
    }
    public T peek()
    {
        return front.val;
    }
    public void clear()
    {
        head = null;
    }
    public T Remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        }
        else
        {
            T ans = front.val;
            front = front.next;
            head = front;
            size--;
            return ans;
        }
    }
    public T Remove(int index)
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        }
        else if(index>=size()||index<0)
        {
            System.out.println("Index is out of Bound");
            return null;
        }
        else if(index==0)
        {
            size--;
            return Remove();
        }
        else
        {
            Node<T> currNode = head,pre = null;
            for(int i = 0;i<index-2;i++)
            {
                pre = currNode;
                currNode = currNode.next;
            }
            T ans = currNode.val;
            pre.next = currNode.next;
            size--;
            return ans;
        }
    }
    public void print()
    {
        Node<T> currNode = front;
        while(currNode!=null)
        {
            System.out.print(currNode.val+" ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}
