package Temp;

public class Implement_stsst 
{
    public static int strstr(String s, String x)
    {
        int j = 0,l = x.length()-1,k=s.length()-1;
       for(int i = 0;i<s.length();i++)
       {
           char chr = s.charAt(i);
           System.out.println(chr+" ");
           String str = "";
           if(chr==x.charAt(j)&&(k-i>=l))
            {
                str = s.substring(i,x.length()+i);
                System.out.println(i+" ");
                System.out.println(str);
                if(str.equals(x))
                    return i;
            }
       }
       return -1;
    }
    public static void main(String args[])
    {
        String x = "abcd";
        String x1 = "Fr";
        String s = "abcabcabcd";
        System.out.println(strstr(s, x));
        //System.out.println(strstr(s, x1));
    }
}
