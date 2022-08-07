package recursion;
import java.util.Scanner;
public class quick_sort 
{
	public static int[] input()
	{
			Scanner ob = new Scanner(System.in);
			System.out.println("ENTER TOTAL ELEMENTS");
			int size = ob.nextInt();
			System.out.println("ENTER ARRAY ELEMENTS");
			int arr[] = new int[size];
			for(int i = 0;i<size;i++)
			{
				arr[i] = ob.nextInt();
			}
			System.out.println("ENTERED ARRAY IS--->");
			print(arr);
			ob.close();
			return arr;
	}
	public static void print(int arr[])
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	private static void Quick_sort(int[] arr,int SI,int EI)
	{
		if(SI>=EI)
			return;
		int pivot_pos = Partition(arr, SI, EI);
		Quick_sort(arr, SI, pivot_pos-1);
		Quick_sort(arr, pivot_pos+1, EI);
	}
	private static int Partition(int[] arr,int SI,int EI)
	{
		int pivot = arr[SI];
		int count = 0;
		for(int c = SI+1;c<=EI;c++)
		{
			if(arr[c]<=pivot)
				count++;	
		}
		int pivot_pos = count+SI;
		int temp = arr[SI];
		arr[SI] = arr[pivot_pos];
		arr[pivot_pos] = temp;
		int i = SI,j = EI;
		while(i<pivot_pos&&j>pivot_pos)
		{
			if(arr[i]>arr[pivot_pos])
			{
				while(j>pivot_pos) 
				{
					if(arr[j]<arr[pivot_pos])
					{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}
					j--;
				}
			}
			i++;
		}
		return pivot_pos;
	}
	public static void main(String[] args) 
	{
		int arr[] = input();
		Quick_sort(arr, 0, arr.length-1);
		System.out.println("SORTED ARRAY ----->");
		print(arr);
	}
}