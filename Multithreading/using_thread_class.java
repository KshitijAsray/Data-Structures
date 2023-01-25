package Multithreading;
public class using_thread_class extends Thread
{
    public void run()
    {
        try 
        {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        } catch (Exception e) 
        {
            System.out.println("Could not start Thread "+e.toString());
        }
    }
    
}
