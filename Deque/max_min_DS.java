package Deque;
import java.util.*;
public class max_min_DS 
{
    Deque<Integer> d1;
     max_min_DS()
    {
        d1 = new ArrayDeque<>();
    }
    void insertMin(int x)
    {
        d1.addFirst(x);
    }
    void insertMax(int x)
    {
        d1.addLast(x);
    }
    int getMin()
    {
        return d1.peekFirst();
    }
    int getMax()
    {
        return d1.peekLast();
    }
    int extractMin()
    {
        return d1.removeFirst();
    }
    int extractMax()
    {
        return d1.removeLast();
    }
    void print()
    {
        System.out.println(d1);
    }
    public static void main(String args[])
    {
        max_min_DS d = new max_min_DS();
        d.insertMin(10);
        d.insertMax(15);
        d.insertMin(5);
        System.out.println(d.extractMax());
        System.out.println(d.extractMin());
        d.insertMin(6);
        d.print();
    }
}
