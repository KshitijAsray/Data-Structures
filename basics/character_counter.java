package basics;
import java.util.Scanner;
public class character_counter 
{
	static Scanner ob = new Scanner(System.in);
	static String str;
	public static void main(String[] args) 
	{
		str = input();
		char ch[] = initial();
		int ch1[] = new int[ch.length];
		for(int p = 0;p<ch1.length;p++)
		{
			ch1[p] = 0;
		}
		for(int i = 0;i<str.length();i++)
		{
			char chr = str.charAt(i);
			for(int j = 0;j<ch.length;j++)
			{
				if(chr==ch[j])
					ch1[j]++;
			}
		}
		print(ch1);
	}
	public static void print(int ch[])
	{
		char ch1[] = initial();
		for(int i = 0;i<ch.length;i++)
		{
			if(ch[i]!=0)
			{
				System.out.println(ch1[i]+"  "+ch[i]);
			}
		}
		System.out.println(" "+"  "+tot_word(str));
		
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
		System.out.println("ENTER THE STRING");
		String str = ob.nextLine();
		return (str);
	}
	public static char[] initial()
	{
		int k = 65;
		char ch[] = new char[52];
		for(int i = 0;i<26;i++)
		{
			ch[i] = (char)(k);
			k++;
		}
		k = 97;
		for(int j =26;j<52;j++)
		{
			ch[j] = (char)(k);
			k++;
		}
		return ch;
	}
}
