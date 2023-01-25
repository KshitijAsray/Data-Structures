package Practice;
import java.util.*;
public class string_permutation 
{
    public static void main(String args[])
    {
        String str = "KSHITIJ";
        int len = str.length();
        ArrayList<String> st = new ArrayList<>();
        permutation(st, str, 0, len);
        //Collections.sort(st);
        System.out.println(st);
        System.out.println(st.size());
    }
    public static void permutation(ArrayList<String> st,String str,int low,int high)
    {
        if(low==high)
            st.add(str);
        for(int i = low;i<high;i++)
        {
            str = new String(swap(str,i,low));
            permutation(st, str, low+1, high);
            str = new String(swap(str, i, low));
        }
    }
    public static char[] swap(String str,int i,int j)
    {
        char arr[] = str.toCharArray();
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
        return arr;
    }
}
