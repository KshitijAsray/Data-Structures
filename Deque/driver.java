package Deque;
import java.util.*;
public class driver 
{
    public static void main(String args[])
    {
        using_simple_array u = new using_simple_array(5);
        u.insertRear(11);
        u.insertFront(12);
        System.out.println(u.getRear());
        u.insertRear(13);
        u.getFront();
        u.insertFront(14);
        u.deleteFront();
        u.deleteRear();
    }

}
