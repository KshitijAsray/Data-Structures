package Practice;
public class linked_list<T> 
{
    Node<T> head;
    Node<T> tail;
    int len;
    linked_list()
    {
        head = null;
        tail = null;
        len = 0;
    }
    public void add(T val)
    {
        if(head==null&&tail==null)
        {
            Node<T> nxt = new Node<T>(val);
            head = nxt;
            tail = nxt;
        }
        else
        {
            Node<T> nxt = new Node<T>(val);
            tail.next = nxt;
            tail = nxt;
        }
        len++;
    }
    public int size()
    {
        return len;
    }
    public void removeLast()
    {
        Node<T> curr = head;
        while(curr.next.next!=null)
            curr = curr.next;
        tail = curr;
        tail.next = null;
        len--;
    }
    public void removefirst()
    {
        head = head.next;
        len--;
    }
    public T getLast()
    {
        return tail.val;
    }
    public void add(int index,T val)
    {
        if(index>=len)
        {
            System.out.println("Index Out Of Bound");
            return;
        }
        if(index==0)
        {
            Node<T> new_head = new Node<>(val);
            new_head.next = head;
            head = new_head;
        }
        else
        {
            Node<T> newNode = new Node<>(val);
            Node<T> curr = head;
            for(int i = 0;i<index-1;i++)
                curr = curr.next;
            newNode.next = curr.next;
            curr.next = newNode;
        }
        len++;
    }
    public void remove(int index)
    {
        if(index>=len||index<0)
        {
            System.out.println("index is Out of Bound");
            return;
        }
        else if(len==1)
            head = null;
        else if(index == 0)
            removefirst();
        else if(index==len-1)
            removeLast();
        else 
        {
            Node<T> curr = head,pre=null;
            for(int i = 0;i<index;i++)
            {
                pre = curr;
                curr = curr.next;
            }
            pre.next = curr.next;
        }
        len--;
    }
    public boolean isEmpty()
    {
        return len==0 ? false:true;
    }
    public T getFirst()
    {
        return head.val;
    }
    public void addFirst(T val)
    {
        Node<T> firsNode = new Node<>(val);
        firsNode.next = head;
        head = firsNode;
        len++;
    }
    public void addLast(T val)
    {
        Node<T> lastNode = new Node<>(val);
        tail.next = lastNode;
        tail = lastNode;
        tail.next = null;
        len++;
    }
    public void print()
    {
        Node<T> curr = head;
        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
    public T get(int index)
    {
        if(index==0)
            return head.val;
        Node<T> curr = head;
        for(int i = 0;i<index;i++)
            curr = curr.next;
        return curr.val;
    }
    public boolean Contains(T val)
    {
        Node<T> curr = head;
        while(curr!=null)
        {
            if(curr.val == val)
                return true;
            curr = curr.next;
        }
        return false;
    }
}
