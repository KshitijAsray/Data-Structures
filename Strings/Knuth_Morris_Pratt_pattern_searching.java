package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Knuth_Morris_Pratt_pattern_searching 
{
    public static void main(String[] args) 
    {
        String txt = "AABAACAADAABAABA";
        String pat = "AABA";
        System.out.println(txt);
        System.out.println(pat);
        ArrayList<Integer> ans = KMP(pat, txt);
        System.out.println(ans);
    }
    public static void fill_lps(String str,int lps[]) 
    {
        int n = str.length();
        int len = 0,i = 1;
        lps[0] = 0;
        while(i<n)
        {
            if(str.charAt(i)==str.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else if(len==0)
            {
                lps[i] = 0;
                i++;
            }
            else
                len = lps[len-1];
        }
    }
    public static ArrayList<Integer> KMP(String pat,String txt)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int pat_len = pat.length();
        int txt_len = txt.length();
        int lps[] = new int[pat.length()];
        fill_lps(pat, lps);
        int i = 0,j=0;
        while(i<txt_len)
        {
            if(pat.charAt(j)==txt.charAt(i))
            {
                i++;
                j++;
            }
            else
            {
                if(j==0)
                    i++;
                else
                    j = lps[j-1];
            }
            if(j==pat_len)
            {
                ans.add(i-j);
                j = lps[j-1];
            }
        }
        if(ans.size()==0)
            return new ArrayList<>(Arrays.asList(0));
        return ans;
    }
    public static void print(int lps[]) 
    {
        for(int i : lps)
            System.out.print(i+" ");
        System.out.println();
    }
}
