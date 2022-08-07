package basics;
import java.util.Scanner;
public class Selection_sort 
{
	static Scanner ob = new Scanner(System.in);
	public static void main(String[] args)
	{
		int arr[] = input();
		int size = arr.length;
		int index = 0;;
		for(int i = 0;i<size-1;i++)
		{
			int min = arr[i];
			index = i;
			for(int j = i+1;j<size;j++)
			{
				if(min>arr[j])
				{
					min = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		print(arr);
	}
	public static int[] input()
	{
		System.out.println("ENTER TOTAL ELEMENTS");
		int size = ob.nextInt();
		System.out.println("ENTER ARRAY ELEMENTS");
		int arr[] = new int[size];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = ob.nextInt();
		}
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
