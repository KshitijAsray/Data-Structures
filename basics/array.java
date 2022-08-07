package basics;
import java.util.Scanner;
public class array 
{
	public static void main(String[] args) 
	{
		int arr[] = input();
		print(arr);

	}
	public static int[] input()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER ARRAY ELEMENTS");
		int arr[] = new int[10];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = ob.nextInt();
		}
		ob.close();
		return arr;
	}
	public static void print(int arr[])
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
