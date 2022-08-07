package basics;
import java.util.Scanner;
public class Recursion_basics 
{
	static int i = 0 ;
	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER THE NO");
		int n = ob.nextInt();
		//print(n);
		//digits(n);
		System.out.println(fib(n));
		ob.close();
	}
	public static int fib(int n)
	{
		if((n==0)||(n==1))
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static void print(int n)
	{
		if(n==1)
		{
			System.out.print(n);
			return;
		}
		
		print(n-1);
		System.out.print(n);
	}
	public static void digits(int n)
	{
		if(n==1)
		{
			i++;
			System.out.println(i);
			return;
		}
		i++;
		digits(n/10);
		
	}
}
