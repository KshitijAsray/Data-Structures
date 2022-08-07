package recursion;
import java.util.Scanner;
public class Merge_sort 
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
	private static void merge(int[] arr,int SI,int EI)
	{
		int[] merged_array = new int[EI-SI+1];
		int mid = (SI+EI)/2;
		int i = SI,j=mid+1,k=0;
		while(i<=mid&&j<=EI)
		{
			if(arr[i]<arr[j])
			{
				merged_array[k] = arr[i];
				i++;
				k++;
			}
			else
			{
					merged_array[k] = arr[j];
					j++;
					k++;
			}
		}
		while(i<=mid)
		{
			merged_array[k] = arr[i];
			i++;
			k++;
		}
		while(j<=EI)
		{
			merged_array[k] = arr[j];
			j++;
			k++;
		}
		for(int u = 0;u<merged_array.length;u++)
			arr[SI+u] = merged_array[u];
	}
	public static void print(int arr[])
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}	
	private static void merge_sort(int arr[],int SI,int EI)
	{
		int mid = (SI+EI)/2;
		if(SI>=EI)
			return;
		merge_sort(arr, SI, mid);
		merge_sort(arr, mid+1, EI);
		merge(arr, SI, EI);
	}
	public static void main(String[] args) 
	{
		int arr[] = input();
		merge_sort(arr, 0, arr.length-1);
		print(arr);
	}

}
