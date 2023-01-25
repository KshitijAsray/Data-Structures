package Multithreading;

public class using_runnable_interface implements Runnable
{
    public void run()
    {
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        } catch (Exception e) 
        {
            System.out.println("Could not start thread "+e.toString());
        }
    }
}
