package basics;
import java.util.Scanner;
public class star_pattern 
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER LIMIT");
		int n = ob.nextInt();
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=n-i;j++)	//for spaces
			{
				System.out.print(" ");
				
			}
			for(int k = 1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		ob.close();
	}
}
