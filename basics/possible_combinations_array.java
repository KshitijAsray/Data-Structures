package basics;
import java.util.*;
public class possible_combinations_array 
{
	static Scanner ob = new Scanner(System.in);
	public static int[] rotation(int arr[])
	{
		int last = arr.length-1;
		int last_element = arr[last];
		for(int i = last;i>0;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = last_element;
		return arr;
	}
	public static void print(int arr[])
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] input()
	{
		System.out.println("ENTER THE NUMBER");
		int n = ob.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = i+1;
		}
		return arr;
	}
	public static int factorial(int n)
	{
		int pro = 1;
		for(int i = 1;i<=n;i++)
		{
			pro = pro*i;
		}
		return pro;
	}
	public static void print(int arr1[][],int m1,int n1)
	{
		for(int i=0;i<m1;i++)
		{
			for(int j = 0;j<n1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int arr[] = input();
		int size = factorial(arr.length);
		int last = arr[0];
		int m=0,n=0;
		int arr2[][] = new int[arr.length][size];
		do 
		{
			for(int i = 0;i<arr.length;i++)
			{
				arr2[m][n] = arr[i];
				n++;
			}
			n=0;
			m++;
			arr = rotation(arr);
			print(arr);
			System.out.println();
//			System.out.println(arr[arr.length-1]);
//			System.out.println(arr[arr.length-1]==last);
		} while (arr[arr.length-1]!=last);
			print(arr2, m, n);

	}

}
