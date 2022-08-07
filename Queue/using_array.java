package Queue;
public class using_array
{
    int cap,size,front,rear;
    int arr[];
    using_array(int cap)
    {
        this.cap = cap;
        size = 0;
        front = 0;
        rear = cap-1;
        arr = new int[cap];
    }
    int deqeue()
    {
        if(size==0)
            return -1;
        int tfront = arr[front];
        front = (front+1)%cap;
        size--;
        return tfront;
    }
    void enqueue(int c)
    {
        if(size==cap)
            return;
        arr[rear] = c;
        rear = (rear+1)%cap;
        size++;
    }
    boolean isEmpty()
    {
        if(size==0)
            return true;
        else
            return false;
    }
    boolean isFull()
    {
        if(size==cap)
            return true;
        else    
            return false;
    }
    int getFirst()
    {
        return arr[front];
    }
    int getLast()
    {
        return arr[rear];
    }
    int size()
    {
        return size;
    }
    void print()
    {
        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}
