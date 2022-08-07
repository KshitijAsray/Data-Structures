package recursion;
import java.util.Scanner;
public class chr_removal 
{
	static char ch;
	static String str1 = "";
	public static String input()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER THE String");
		String str  = ob.nextLine();
		System.out.println("ENTER THE CHARCTER");
		ch = ob.next().charAt(0);
		System.out.println("INITIAL STRING IS");
		print(str);
		ob.close();
		return str;
	}
	public static void print(String str)
	{
		for(int i = 0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	public static String removal(String str,char r,int l)
	{
		if(l==str.length())
			return str1;
		if(str.charAt(l)!=r)
		{
			str1 = str1+str.charAt(l);
			removal(str, r, l+1);
		}
		else
			removal(str, r, l+1);
		return str1;
	}
	public static void main(String[] args) 
	{
		String str = input();
		print(removal(str, ch, 0));

	}

}