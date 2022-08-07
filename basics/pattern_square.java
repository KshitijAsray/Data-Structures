package basics;

import java.util.Scanner;

public class pattern_square 
{
	public static void main(String args[])
	{
		System.out.println("ENTER THE LIMIT");
		Scanner ob = new Scanner(System.in);
		int l = ob.nextInt();
		for(int i = 1;i<=l;i++)
		{
			for(int j = 1;j<=l;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		ob.close();
	}
}
