package oops;

public class car implements vechicle_interface 
{

    //@Override
    public void changegear() 
    {
        System.out.println("car gear");   
    }
    public void type() 
    {
        System.out.println("4 wheeler"); 
    }
    @Override
    public void accleration()
    {
        System.out.println("accleartion of car");
    }
    public static void main(String args[])
    {
        car ob = new car();
        ob.accleration();
        ob.type();
        ob.changegear();
    }
}
