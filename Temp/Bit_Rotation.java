package Temp;

import java.util.ArrayDeque;
import java.util.Deque;

public class Bit_Rotation 
{
    public static void main(String args[])
    {
        int n = 288;
        int D = 2;
        Deque<Integer> arr = new ArrayDeque<>();
        while(n>0)
        {
            arr.addFirst(n%D);
            n=n/D;
        }
        System.out.println(arr+" k");
        int less_length = 16-arr.size();
        if(less_length!=0)
        {
            for(int i = 1;i<=less_length;i++)
            {
                arr.addFirst(0);
            }
        }
        System.out.println(arr+" p");
        String s = arr.toString();
        int left = left_Rotation(s, D);
        int right = Right_Rotation(s, D);
        System.err.println(left+" "+right);
    }
    public static int left_Rotation(String arr,int D)
    {
        String original = arr;
        System.out.println(original+" l");
        int remaining = 16-D;
        String remain = original.substring(remaining,original.length());
        String left = original.substring(0,remaining);
        int res = Integer.parseInt(remain.concat(left),2);
        return res;
    }
    public static int Right_Rotation(String arr,int D)
    {
        String original = arr;
        System.out.println(original+" r");
        int remaining = 16-D;
        String remain = original.substring(remaining,original.length());
        String left = original.substring(0,remaining);
        int res = Integer.parseInt(left.concat(remain),2);
        return res;
    }
}
