package recursion;
import java.util.Scanner;
public class subsequences_string 
{
	public static void main(String[] args) 
	{
		String str = input();
		System.out.println("ORIGINAL STRING");
		print_String(str);
		print_String_array(Subseqences(str));;
	}
	public static String input()
	{	
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String str = ob.nextLine();
		ob.close();
		return str;
	}
	public static void print_String(String arr)
	{
		for(int i = 0;i<arr.length();i++)
		{
			System.out.print(arr.charAt(i)+" ");
		}
		System.out.println();
	}
	public static void print_String_array(String str[])
	{
		System.out.println("RESULANT STRING");
		for(int i = 0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	private static String[] Subseqences(String str)
	{
		if(str.length()==0)
		{
			String ans[] = {""};
			return ans;
		}
		String[] small_ans = Subseqences(str.substring(1));
		String ans[] = new String[2*small_ans.length];
		int k = 0;
		for(int i = 0;i<small_ans.length;i++)
		{
			ans[k] = small_ans[i];
			k++;
		}
		for(int i = 0;i<small_ans.length;i++)
		{
			
			ans[k] = str.charAt(0)+small_ans[i];
			k++;
			
		}
		return ans;
	}
}
