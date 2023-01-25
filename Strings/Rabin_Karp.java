package Strings;
public class Rabin_Karp 
{
    private static final int d = 256;
    private static final int q = 101;
    public static void main(String[] args)
    {
        String txt = "THIS IS A TEST TEXT";
        String pat = "TEST";
        txt = txt.toLowerCase();
        pat = pat.toLowerCase();
        int ans = Rabin_Karp_Algo(txt, pat);
        System.out.println("Occurances are : "+ans);
    }
    public static int cal_h(int len_pat)
    {
        int h = 1;
        for(int i = 0;i<len_pat-1;i++) // calculate Math.pow(d,M-1) as value can be very large so modulus q
            h = (h*d)%q;
        return h;
    }
    public static int Rabin_Karp_Algo(String txt,String pat)
    {
        int len_txt = txt.length();
        int len_pat = pat.length();
        int h = cal_h(len_pat);
        int hash_pat = 0;
        int hash_txt = 0;
        int count  = 0;
        for(int i = 0;i<len_pat;i++)
        {
            hash_pat = ((hash_pat*d)+pat.charAt(i))%q;
            hash_txt = ((hash_txt*d)+txt.charAt(i))%q;
        }
        System.out.println(hash_pat+" "+hash_txt);
        for(int i = 0;i<=len_txt-len_pat;i++)
        {
            if(hash_pat==hash_txt)
            {
                String temp = txt.substring(i, i+len_pat);
                System.out.println(temp);
                if(temp.equalsIgnoreCase(pat))
                    count++;
            }
            if(i<len_txt-len_pat)
                hash_txt = ((d*(hash_txt-txt.charAt(i)*h))+txt.charAt(i+len_pat))%q;
            if(hash_txt<0)
                hash_txt = hash_txt+q;

        }
        return count;
    }   
}
