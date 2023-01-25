package Multithreading;

public class using_thread 
{
    public static void main(String args[])
    {
        for(int i = 0;i<10;i++)
        {
            using_thread_class ob = new using_thread_class();
            ob.run();
        }
    }
}
