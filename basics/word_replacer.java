package basics;

import java.util.Scanner;

public class word_replacer 
{
	static Scanner ob = new Scanner(System.in);

	public static void main(String args[]) 
	{
		System.out.println("ENTER THE STRING");
		String str = (input()+" ");
		System.out.println("ENTER THE WORD TO BE REPLACED");
		String str2 = input();
		System.out.println("ENTER THE WORD BY WHICH IT IS REPLACED");
		String str4 = input();
		String str1 = "";
		String str3 = "";
		int len = str.length();
		for(int i = 0;i<len;i++)
		{
			char ch = str.charAt(i);
			if(ch!=' ')
			{
				str1 = str1+ch;
			}
			else
			{
				if(str1.equalsIgnoreCase(str2))
				{
					str3 = str3+" "+str4;
				}
				else
					str3 = str3+" "+str1;
				str1 = "";
			}
		}
		print(str3);
	}
	public static void print(String arr)
	{
		for(int i = 0;i<arr.length();i++)
		{
			System.out.print(arr.charAt(i));
		}
		
	}
	public static int tot_word(String str)
	{
		int c = 0;
		for(int i = 0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				c++;
		}
		return (c);  // total words
	}
	public static String input()
	{	
		String str = ob.nextLine();
		return (str);
	}

}
