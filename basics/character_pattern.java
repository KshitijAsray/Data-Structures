package basics;
import java.util.Scanner;
public class character_pattern 
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		int n = ob.nextInt();
		int k = 65,j;
		for(int i = 1;i<=n;i++)
		{
			for(j = 1;j<=n;j++)
			{
				System.out.print((char)k+" ");
				k++;
			}
			k = 65+i;
			System.out.println();
		}
		ob.close();
	}
}
