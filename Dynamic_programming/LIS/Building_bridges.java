package Dynamic_programming.LIS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
                        // Sort the array according the first element and if they are same then use the second element
                        // find the LIS of the array by the second element
public class Building_bridges 
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> cities = new ArrayList<>();
        cities.add(0, new ArrayList<>(Arrays.asList(8,1)));
        cities.add(1, new ArrayList<>(Arrays.asList(1,2)));
        cities.add(2, new ArrayList<>(Arrays.asList(4,3)));
        cities.add(3, new ArrayList<>(Arrays.asList(3,4)));
        cities.add(4, new ArrayList<>(Arrays.asList(2,6)));
        cities.add(5, new ArrayList<>(Arrays.asList(6,7)));
        cities.add(6, new ArrayList<>(Arrays.asList(7,8)));
        cities.add(7, new ArrayList<>(Arrays.asList(5,5)));
        int k = bridges(cities);
        System.out.println("NO of Bridges : "+k);
    }
    public static int bridges(ArrayList<ArrayList<Integer>> arr)
    {
        ArrayList<pair> cities = new ArrayList<>();
        for(ArrayList<Integer> i : arr)
            cities.add(new pair(i.get(0), i.get(1)));
        Collections.sort(cities, new Mycomp());
        ArrayList<Integer> tail = new ArrayList<>();
        tail.add(0, cities.get(0).south);
        for(pair i : cities)
        {
            if(i.south>tail.get(tail.size()-1))
                tail.add(i.south);
            else
            {
                int c = ceil_Index(tail, 0, tail.size()-1, i.south);
                tail.set(c,i.south);
            }
        }
        System.out.println(tail);
        return tail.size();
    }
    public static int ceil_Index(ArrayList<Integer> tail,int lb,int ub,int key)
    {
        while(lb<ub)
        {
            int mid = lb+(ub-lb)/2;
            if(key>=tail.get(mid))
                lb = mid+1;
            else
                ub = mid;
        }
        return ub;
    }   
}
