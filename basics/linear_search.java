package basics;
import java.util.Scanner;
public class linear_search 
{
	static int x;

	public static void main(String[] args) 
	{
		int arr[]= input();
		int c=0;
		for(int i = 0;i<arr.length;i++)
		{
			if(x==arr[i])
			{
				c=1;
				System.out.println("ELEMENT FOUND AT "+(i+1));
				break;
			}
				
		}
		if(c==0)
			System.out.println("Element not Found");

	}
	public static int[] input()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		int m = ob.nextInt();
		System.out.println("ENTER ARRAY ELEMENTS");
		int arr[] = new int[m];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = ob.nextInt();
		}
		System.out.println("ENTER ELEMENT TO BE SEARCHED");
		x = ob.nextInt();
		ob.close();
		return arr;
	}

}
