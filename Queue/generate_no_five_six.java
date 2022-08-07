package Queue;
import java.util.*;
public class generate_no_five_six 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the No");
        int n = ob.nextInt();
        printn(n);
        ob.close();

    }
    static void printn(int n)
    {
        Queue<String> q1 = new ArrayDeque<String>();
        q1.add("5");
        q1.add("6");
        int j = 1;
        while(j<=n)
        {
            String current = q1.remove();
            System.out.print(current+" ");
            q1.add(current+"5");
            q1.add(current+"6");
            j++;
        }
        
    }
}
