package basics;
import java.util.Scanner;
public class bubble_sort 
{
	public static int[] input()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER TOTAL ELEMENTS");
		int size = ob.nextInt();
		System.out.println("ENTER ARRAY ELEMENTS");
		int arr[] = new int[size];
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
	public static void main(String[] args) 
	{
		int arr[] = input();
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.println("SORTED ELEMENTS");
		print(arr);
	}
	
}
