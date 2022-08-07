package basics;
import java.util.Scanner;
public class largest_smallest_array {

	public static void main(String[] args) 
	{
		int arr[] = input();
		int size = arr.length;
		System.out.println("ENTERED NUMBERS ARE");
		print(arr);
		System.out.println();
		int max = arr[0],min = arr[0];
		for(int i = 0;i<size;i++)
		{
			if(max<arr[i])
				max = arr[i];
			if(min>arr[i])
				min = arr[i];
		}
		System.out.println("LARGEST NUMBER IS = "+max);
		System.out.println("SMALLEST NUMBER IS = "+min);
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
