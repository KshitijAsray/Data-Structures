package Dynamic_programming;

import java.util.Arrays;

public class Longest_common_subsequence_memoization 
{
    public static void main(String args[])
    {
        Longest_common_subsequence_memoization ob = new Longest_common_subsequence_memoization();
        String s1 = "ababaxh";
        String s2 = "asdghgjabopababa";
        int res = ob.LCS_memo(s1, s2, s1.length(), s2.length());
        System.out.println(res);
    }
    boolean flag = true;
    int memo[][];
    public int LCS_memo(String s1,String s2,int m,int n)
    {
        if(flag==true)
        {
            memo = new int[m+1][n+1];
            flag = false;
            for(int[] i : memo)
                Arrays.fill(i,-1);
        }
        if(memo[m][n]!=-1)
            return memo[m][n];
        if(m==0||n==0)
            memo[m][n] = 0;
        else
        {
            if(s1.charAt(m-1)==s2.charAt(n-1))
                memo[m][n] = 1+LCS_memo(s1, s2, m-1, n-1);
            else
                memo[m][n] = Math.max(LCS_memo(s1, s2, m-1, n),LCS_memo(s1, s2, m, n-1));
        }
        return memo[m][n];
    }
}
