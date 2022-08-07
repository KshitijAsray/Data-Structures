package basics;
import java.util.Scanner;
public class functions 
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER NO TO be checked");
		int n = ob.nextInt();
		if(prime(n)==true)
			System.out.println("Prime no");
		else
			System.out.println("NOT Prime no");
			ob.close();
	}
	public static boolean prime(int n)
	{
		int c = 0;
		for(int i = 1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
			return true;
		else
			return false;
	}
}
