package Strings;
import java.util.*;
public class subsequence_of_other_string 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the string 1");
        String str1 = ob.nextLine();
        System.out.println("Enter the string 2");
        String str2 = ob.nextLine();
        System.out.println(issubsequenceof(str1, str2));
        ob.close();
    }
    public static boolean issubsequenceof(String str1,String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();
        int i=0,j=0;
        while(i<len1&&j<len2)
        {
            if(str1.charAt(i)==str2.charAt(j))
                i++;
            j++;
        }
        return i==len1 ? true:false;
    }
}