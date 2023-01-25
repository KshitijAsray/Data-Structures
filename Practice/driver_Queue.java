package Practice;

public class driver_Queue 
{
    public static void main(String args[])
    {
        Queue_linked_list<Integer> ob = new Queue_linked_list<>();
        ob.add(1);   
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(7);
        ob.add(8);
        ob.print();
        ob.Remove(5);
        ob.print();      
    }
}
