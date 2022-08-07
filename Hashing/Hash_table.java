package Hashing;
import java.util.*;
public class Hash_table
{
    ArrayList<LinkedList<Integer>> list;
    int BUCKET;
    Hash_table(int b)
    {
        BUCKET = b;
        list = new ArrayList<LinkedList<Integer>>();
        for(int i = 0;i<b;i++)
        {
            list.add(new LinkedList<Integer>());
        }
        
    }
    void insert(Integer k)
    {
        int i = k % BUCKET;
        list.get(i).add(k);
    }
    boolean search(Integer k)
    {
        int i = k % BUCKET;
        return list.get(i).contains(k);
    }
    void delete(Integer k)
    {
        int i = k % BUCKET;
        list.get(i).remove(k);
    }
    void print()
    {
        for(LinkedList<Integer> m : list)
        {
            System.out.println(m);
        }
    }
}
