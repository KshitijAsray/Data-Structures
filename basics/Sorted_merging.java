package basics;
import java.util.Scanner;
public class Sorted_merging {

	public static void main(String[] args) 
	{
		int arr1[] = input();
		int arr2[] = input();
		int k = 0,i=0,j=0;
		int size = arr1.length+arr2.length;
		int arr3[] = new int[size];
		while(i<arr1.length&&j<arr2.length)
			{
				if(arr1[i]<arr2[j])
				{
					arr3[k] = arr1[i];
					i++;
					k++;
				}
				else
				{
					arr3[k] = arr2[j];
					j++;
					k++;
				}
			}
		while(i<arr1.length)
		{
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		
		print(arr3);

	}
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

}
