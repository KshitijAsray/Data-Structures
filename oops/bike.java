package oops;

public class bike extends vechicle 
{
    public void accleration()
    {
        System.out.println("accleration of bike called");
    }
    public void changegear() 
    {
        System.out.println("bike gear");   
    }
    public  void color()
    {
        System.out.println("color of bike called");
    }
    public static void main(String args[])
    {
        bike ob = new bike();
        ob.accleration();
        ob.color();
    }
}
