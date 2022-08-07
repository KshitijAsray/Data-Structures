package basics;
import java.util.Scanner;
public class Word_by_word_reverse 
{
	public static void main(String[] args) 
	{
		String str = input();
		String str1 = "";
		String str2[] = new String[tot_word(str)];
		int k = 0;
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
				str2[k] = str1;
				k++;
				str1 = "";
			}
		}
		print(str2);
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
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String str = ob.nextLine();
		ob.close();
		return (str+" ");
	}
	public static void print(String str[])
	{
		System.out.println("RESULANT STRING");
		for(int i = str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	}

}
