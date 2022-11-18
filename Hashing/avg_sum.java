package Hashing;
import java.util.*;
public class avg_sum 
{
    public static void main(String args[])
    {
        int no[] = {1,1,5,3,1,3,5};
        int sum[] = {10,20,30,15,17,19,7};
        int len = sum.length;
        get_Avg(no, sum, len);
    }
    public static void get_Avg(int no[],int sum[],int len)
    {   
        HashMap<Integer,Integer> frq = new HashMap<>();
        HashMap<Integer,Integer> avg = new HashMap<>();
        for(int i = 0;i<len;i++)
        {
            frq.put(no[i],frq.getOrDefault(no[i],0)+1);
            avg.put(no[i],0);
        }
        for(int i = 0;i<len;i++)
            avg.put(no[i],avg.get(no[i])+sum[i]);
        for(Map.Entry<Integer,Integer> o : avg.entrySet())
        {
            if(frq.containsKey(o.getKey()))
            {
                int x = o.getValue();
                int freq = frq.get(o.getKey());
                o.setValue(x/freq);
            }
        }
        for(int i = 0;i<len;i++)
        {
            sum[i] = sum[i]-avg.get(no[i]);
        }
        for(int i = 0;i<len;i++)
            System.out.print(sum[i]+" ");
    }
}
