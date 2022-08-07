package Deque;
import java.util.*;
// for each and iterator
public class Traversal 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        Deque<Integer> d1 = new LinkedList<>();
        d1.offerFirst(10);
        d1.offerLast(12);
        d1.offerFirst(13);
        d1.offerLast(14);
        System.out.println("Enter your choice");
        System.out.println("1 - front to rear traversal");
        System.out.println("2 - rear to front traversal");
        int choice  = ob.nextInt();
        ob.close();
        iteration_deque(choice,d1);
    }
    static void iteration_deque(int choice, Deque<Integer> d1)
    {
        switch(choice)
        {
            case 1:
            {
                Iterator<Integer> it = d1.iterator();
                while(it.hasNext())
                {
                    System.out.println(it.next()+" ");
                }
                break;
            }
            case 2:
            {
                Iterator<Integer> it = d1.descendingIterator();
                while(it.hasNext())
                {
                    System.out.println(it.next()+" ");
                }
                break;
            }
        }
    }
}
