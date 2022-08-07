package basics;
import java.util.Scanner;
public class strings 
{
	static String s;
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENter the string");
		s = ob.nextLine();
		String h = "";
		int ch = s.lastIndexOf(' ');
		for(int i = 0;i<ch;i++)
		{
			if(s.charAt(i)==' ')
			{
				h = h+'.'+s.charAt(i+1);
			}
		}
		System.out.print(s.charAt(0));
		print(h,ch);
		ob.close();
	}
	public static void print(String arr,int ch)
	{
		for(int i = 0;i<arr.length();i++)
		{
			System.out.print(arr.charAt(i));
		}
		System.out.print(" "+s.substring(ch));
		
	}

}
