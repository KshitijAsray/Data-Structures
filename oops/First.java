package oops;

public class First 
{
    public int second = 10;
    protected int third = 90;
    private int zero = 89;
    public  void sum()
    {
        int sum = second+third+zero;
        System.out.println(sum+" of First Class");
    }
    public void getzero()
    {
        System.out.println(zero);
    }
}
