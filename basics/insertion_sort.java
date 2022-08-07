package basics;
import java.util.Scanner;
public class insertion_sort 
{
	static Scanner ob = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int arr[] = input();
		int size = arr.length;
		for(int i = 1;i<size;i++)
		{
			int temp = arr[i];
			int j = i-1;
			while(((j)>=0)&&(arr[j]>temp))
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
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
