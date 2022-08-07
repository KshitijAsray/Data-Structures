package basics;
import java.util.Scanner;
public class triangular 
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENter the limit");
		int n = ob.nextInt();
		int k = 1;
		for(int i = 1;i<=n;i++)
		{
			k = i;
			for(int j = 1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		ob.close();
	}
}
