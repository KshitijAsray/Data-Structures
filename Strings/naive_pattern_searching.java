package Strings;

public class naive_pattern_searching 
{
    public static void main(String[] args)
    {
        String txt = "aabaacaadaabaaabaa";
        String pat = "aaba";
        int ans = pattern_search(pat, txt);
        System.out.println(ans);
    }
    public static int pattern_search(String pat,String txt)
    {
        int no_of_passes = txt.length()-pat.length();
        int count = 0;
        for(int i = 0;i<=no_of_passes;i++)
        {
            String curr = txt.substring(i, i+pat.length());
            if(curr.equalsIgnoreCase(pat))
                count++;
        }
        return count;
    }
}
