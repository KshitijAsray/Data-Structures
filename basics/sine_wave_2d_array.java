package basics;
import java.util.Scanner;
public class sine_wave_2d_array 
{
	static Scanner ob = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int m,n;
		System.out.println("ENTER ROWS");
		m = ob.nextInt();
		System.out.println("ENTER COLUMN");
		n = ob.nextInt();
		int arr[][] = input_array(m,n);
		int i = 0;
		System.out.println("NEW ARRAY");
		while(i<m)
		{
			if(i%2==0)
			{
				for(int j = 0;j<n;j++)
				{
					System.out.print(arr[j][i]+" ");
				}
			}
			else
			{
				for(int j = n-1;j>=0;j--)
				{
					System.out.print(arr[j][i]+" ");
				}
			}
			i++;
		}
	}
	public static int[][] input_array(int m,int n)
	{
		
		int arr[][] = new int[m][n];
		System.out.println("ENTER THE ELEMENTS");
		for(int i = 0;i<m;i++)
		{
			
			for(int j = 0;j<n;j++)
			{
				
				arr[i][j] = ob.nextInt();
			}
		}
		System.out.println("ENTERED ARRAY IS");
		print(arr,m,n);
		return arr;
	}
	public static void print(int arr1[][],int m1,int n1)
	{
		for(int i=0;i<m1;i++)
		{
			for(int j = 0;j<n1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
