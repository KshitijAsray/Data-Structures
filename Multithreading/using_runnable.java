package Multithreading;

public class using_runnable 
{
    public static void main(String[] args) 
    {
        for(int i = 0;i<10;i++)
        {
            Thread ob = new Thread(new using_runnable_interface());
            ob.run();
        }
    }
}
