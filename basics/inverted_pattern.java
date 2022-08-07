package basics;
import java.util.Scanner;
public class inverted_pattern 
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER LIMIT");
		int n = ob.nextInt();
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<n-i+1;j++)
			{
				System.out.print("*");
			}
			for(int j = 1;j<=i-1;j++)
			{
				System.out.println(" ");
			}
			System.out.println();
		}
		ob.close();
	}
}
