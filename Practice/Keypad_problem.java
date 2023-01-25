package Practice;

import java.util.ArrayList;

public class Keypad_problem 
{
    static ArrayList<String> map = new ArrayList<>();
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3};
        int N = arr.length;
        map.add(0,"");
        map.add(1,"");
        map.add(2,"abc");
        map.add(3,"def");
        map.add(4,"ghi");
        map.add(5,"jkl");
        map.add(6,"mno");
        map.add(7,"pqrs");
        map.add(8,"tuv");
        map.add(9,"wxyz");
        ArrayList<String> ans = new ArrayList<>();
        possible_words(ans,arr, N,"",0);
        System.out.println(ans);
    }
    public static void possible_words(ArrayList<String> ans,int arr[],int N,String s,int index)
    {
        if(index==N)
        {
            ans.add(s);
            return;
        }
        for(int i = 0;i<map.get(arr[index]).length();i++)
            possible_words(ans, arr, N, (s+map.get(arr[index]).charAt(i)), index+1);
    }
}
