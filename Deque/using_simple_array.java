package Deque;

public class using_simple_array 
{
    // public static void main(String args[])
    // {

    // }
    int arr[];
    int size,cap;
    using_simple_array(int cap)
    {
        cap = this.cap;
        size=0;
        arr = new int[cap];
    }
    boolean isEmpty()
    {
        return (size==0)? true : false;
    }
    boolean isFull()
    {
        return (size==cap)? true : false;
    }
    void insertRear(int x)
    {
        if(isFull()==true)
            return;
        arr[size] = x;
        size++;
    }
    void insertFront(int x)
    {
        if(isFull()==true)
            return;
        for(int i = size-1;i>=0;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[0] = x;
        size++;
    }
    void deleteRear()
    {
        if(isEmpty()==true)
            return;
        size--;
    }
    void deleteFront()
    {
        for(int i = 0;i<size;i++)
        {
            arr[i] = arr[i+1];
        }
        size--;
    }
    int getFront()
    {
        if(isEmpty()==true)
            return -1;
        return arr[0];
    }
    int getRear()
    {
        if(isEmpty()==true)
            return -1;
        return arr[size];
    }
}
