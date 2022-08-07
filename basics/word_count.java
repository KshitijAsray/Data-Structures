package basics;

import java.util.Scanner;

public class word_count {

	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String str = ob.nextLine();
		ob.close();
		int c = 0;
		for(int i = 0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				c++;
		}
		System.out.println(c);

	}

}
