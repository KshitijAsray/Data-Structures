package Backtracking;
import java.util.ArrayList;
public class generate_permutation 
{
    public static void main(String args[])
    {
        String str = "ABC";
        int n = str.length();
        ArrayList<String> sty = new ArrayList<>();
        permutation(sty,str, 0, n);
        System.out.println(sty);
    }    
    public static void permutation(ArrayList<String> sty,String str,int start,int end)
    {
        if(start==end)          // when whole string is generated then start==end then add it to the list
            sty.add(str);
        for(int i = start;i<end;i++)
        {
            str = new String(swap(str, i, start));
            permutation(sty, str, start+1, end);
            str = new String(swap(str, i, start));
        }
    }
    public static char[] swap(String str,int i,int j)
    {
        char ch[] = str.toCharArray();
        char temp = str.charAt(i);
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
}
