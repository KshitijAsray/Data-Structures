import java.util.*;
class temp1 
{
    public static void main(String args[])
    {
        String str = "gooogbdfhhhxgfhfvogle";
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            map1.put(ch,map1.getOrDefault(ch, 0)+1);
        }
        String ans = "";
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(map1.containsKey(ch)&&map1.get(ch)==1)
                ans = ans+ch;
        }
        System.out.println(ans);
    }
    public static void Linked_HashMap(String str)
    {
        LinkedHashMap<Character,Integer> map1 = new LinkedHashMap<>();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        String ans = "";
        for(Map.Entry<Character,Integer> tu : map1.entrySet())
        {
            if(tu.getValue()==1)
                ans = ans+tu.getKey();
        }
        System.out.println(ans);
    }
    public static void HashMap(String str)
    {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            map1.put(ch,map1.getOrDefault(ch, 0)+1);
        }
        String ans = "";
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(map1.containsKey(ch)&&map1.get(ch)==1)
                ans = ans+ch;
        }
        System.out.println(ans);
    }
}
