package basics;

import java.util.Scanner;

public class binary_search 
{
	static Scanner ob = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int arr[] = bubble_sort();
		System.out.println("ENTER ELEMENT TO BE SEARCHED");
		int x = ob.nextInt();
		int s = arr.length;
		int ub = s-1;
		int lb = 0;
		int mid = (ub+lb)/2;
		int c=0,index=0;
		while(lb<=ub)
		{
			if(x<arr[mid])
				lb = mid+1;
			else if(x>arr[mid])
				ub = mid-1;
			else
			{
				c=1;
				index = mid;
				break;
			}
		}
		if(c==0)
			System.out.println("ELEMENT NOT FOUND");
		else
		{
			System.out.println("ELEMENT FOUND AT "+index);
		}
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
	public static int[] bubble_sort() 
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
		return arr;
	}

}
