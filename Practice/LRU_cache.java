package Practice;
import java.util.*;
public class LRU_cache 
{
    int cach_size;
    Deque<Integer> q1;
    HashSet<Integer> set;
    LRU_cache(int cach_size)
    {
        this.cach_size = cach_size;
        q1 = new LinkedList<>();
        set = new HashSet<>();
    }
    public void add(int page)
    {
        if(!set.contains(page))
        {
            if(q1.size()==cach_size)
            {
                int last = q1.removeLast();
                set.remove(last);
            }
        }
        else
        {
            q1.remove(page);
        }
        q1.addFirst(page);
        set.add(page);
    }
    public void print()
    {
        Iterator<Integer> ob = q1.iterator();
        while(ob.hasNext())
            System.out.print(ob.next()+" ");
    }
    public static void main(String args[])
    {
        LRU_cache ob = new LRU_cache(4);
        int arr[] = {1,2,3,1,4,5};
        for(int i : arr)
            ob.add(i);
        ob.print();
    }
}
