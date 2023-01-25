package Strings;
import java.util.*;
/*  Step 1: Iterate over the entire String
    Step 2: Iterate from the end of string 
        in order to generate different substring
        add the substring to the list
    Step 3: Drop kth character from the substring obtained 
        from above to generate different subsequence.
    Step 4: if the subsequence is not in the list then recur. */
public class subsequences 
{
    public static void main(String args[])
    {
        String str = "qwerty";
        TreeSet<String> set = new TreeSet<>();
        find_Subsequences(str, set);
        for(String g : set)
            System.out.print(g+" ");
    }
    public static void find_Subsequences(String str,TreeSet<String> set)
    {
        for(int i = 0;i<str.length();i++)
        {
            for(int j = str.length();j>i;j--)
            {
                StringBuilder temp = new StringBuilder(str.substring(i, j));
                if(!set.contains(temp.toString()))
                    set.add(temp.toString());
                else
                {
                    for(int k = 1;k<temp.length();k++)
                    {
                        temp.deleteCharAt(k);
                        find_Subsequences(temp.toString(), set);
                    }
                }
            }
        }
    }
}
