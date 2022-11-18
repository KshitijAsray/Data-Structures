package Practice;
public class Queue_array
{
    int arr[];
    int cap;
    int front,rear;
    Queue_array(int cap)
    {
        arr = new int[cap];
        rear = -1;
        front = -1;
    }
    public int size()
    {
        if(front==-1&&rear==-1)
            return 0;
        else
            return (rear-front+1);
    }
    public boolean isFull()
    {
        if(front==0&&rear==cap-1)
            return true;
        else
            return false;
    }
    public boolean isEmpty()
    {
        if(front==-1&&rear==-1)
            return true;
        else
            return false;
    }
    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return Integer.MAX_VALUE;
        }
        if(size()==1)
        {
            int ans = arr[front];
            front=-1;
            rear = -1;
            return ans;
        }
        int ans = arr[front];
        front++;
        return ans;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return Integer.MAX_VALUE;
        }
        return arr[front];
    }
    public void adjust()
    {
        int diff = front;
        for(int i = 0;i<size();i++)
            arr[i] = arr[i+diff];
        front = 0;
        rear = size()-1;
    }
    public void add(int val)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            return;
        }
        if(rear==size()-1&&front!=0)
        {
            adjust();
        }
        if(isEmpty())
        {
            rear++;
            front++;
            arr[rear] = val;
        }
        rear++;
        arr[rear] = val;
    }
    public int remove(int index)
    {
        if(isEmpty())
        {
            System.out.println("Queue is Full");
            return Integer.MAX_VALUE; 
        }
        else if(size()==1&&index==front&&index==rear)
        {
            front=-1;
            rear=-1;
            return arr[index];
        }
        else if(size()==2&&index>=front&&index<=rear)
        {
            if(index==rear)
                rear--;
            else
                front++;
            return arr[index];
        }
        else if(index>front&&index<rear)
        {
            int ans = arr[index];
            for(int i = index+1;i<=rear;i++)
            {
                arr[i-1]=arr[i];
            }
            rear--;
            return ans;
        }
        else 
            System.out.println("Index is Out Of Bound");
        return Integer.MAX_VALUE;
    }
    public boolean Contains(int val)
    {
        for(int i = front;i<=rear;i++)
        {
            if(arr[i]==val)
                return true;
        }
        return false;
    }
    public void print()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = front;i<=rear;i++)
            System.out.print(arr[i]+" ");
    }
}
