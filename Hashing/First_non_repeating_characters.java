package Hashing;

import java.util.HashMap;

public class First_non_repeating_characters 
{
    public static void main(String[] args) 
    {
        String str = "aabc";
        String ans = FirstNonRepeating(str);
        System.out.println(ans);
    }
    public static String FirstNonRepeating(String A)
    {
        String str = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Integer> map = new HashMap<>();
        String ans = "";
        for(int i = 0;i<str.length();i++)
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0));
        for(int i = 0;i<A.length();i++)
        {
            map.put(A.charAt(i), map.get(A.charAt(i))+1);
            if(map.get(A.charAt(i))>1)
                ans +="#";
            else
                ans += A.charAt(i);
        }
        return ans;
    }
}
