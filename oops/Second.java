package oops;

public class Second extends First
{
    public int second = 11;
    protected int third = 9;
    private int zero = 8;
    public void sum()
    {
        int sum = second+third+zero;
        System.out.println(sum+" of Second Class");
    }
    public void print(int x, int y)
    {
        int sum = x+y;
        System.out.println(sum);
    }
    public void print(int x,int y,int z)
    {
        int sum = x+y+z;
        System.out.println(sum);
    }
    public void bhi()
    {
        super.sum();
    }
    public static void main(String args[])
    {
        // Runtime polymorphism
        First ob1 = new First();
        ob1.sum();//Sum of base class will run
        First ob2 = new Second();
        ob2.sum();// sum of child class will run
        Second ob3 = new Second();
        ob3.sum();//sum of child class will run
        ob3.bhi();
        // Compile Time polymorphism
        Second ob4 = new Second();
        ob4.print(10, 11);
        ob4.print(12, 13, 15);
    }
}
