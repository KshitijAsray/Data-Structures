package Practice;

public class driver_Queue_array 
{
    public static void main(String args[])
    {
        Queue_array ob = new Queue_array(10);
        ob.add(1);   
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(7);
        ob.add(8);
        for(int i = 0;i<8;i++)
            ob.remove();
        ob.print();       
    }
}
