package Temp;
import java.util.Random;

public class temp 
{
    public static void main(String[] args)
    {
        int n = 10;
        Random no = new Random();
        while(n>0)
        {
            int noi = 0 + no.nextInt(9);
            System.out.print(noi+" ");
            n--;      
        }
        
        
    }
}
