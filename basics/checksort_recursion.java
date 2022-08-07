package basics;
import java.util.Scanner;
public class checksort_recursion 
{
	static Scanner ob = new Scanner(System.in);
	public static boolean checksort(int arr[])
	{
		int size = arr.length;
		if(size<=1)
			return true;
		if(arr[0]>arr[1])
			return false;
		int one_less[] = new int[size-1];
		for(int i = 1;i<size;i++)
			one_less[i-1] = arr[i];
		return checksort(one_less);
	}
	public static boolean checksort_optimised(int arr[],int startIndex)
	{
		if(startIndex>=arr.length-1)
			return true;
		if(arr[startIndex]>arr[startIndex+1])
			return false;
		checksort_optimised(arr, startIndex+1);
		return checksort_optimised(arr, startIndex+1);
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
	public static void main(String[] args) 
	{
		int arr[] = input();
		if(checksort_optimised(arr, 0))
			System.out.println("ARRAY IS SORTED !!!!");
		else 
			System.out.println("ARRAY IS NOT SORTED !!!!");
	}

}
