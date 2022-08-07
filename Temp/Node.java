package Temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

class Complete{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> permute (int arr[][], int n)
    {
        ArrayList<Pizza> pz = new ArrayList<Pizza>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            int sum = 0;
            for(int j = 0;j<2;j++)
            {
                sum = sum+arr[i][j];
            }
            pz.add(new Pizza(sum,i+1));
        }
        Collections.sort(pz, new PizzaComparator());
        ListIterator<Pizza> lt = pz.listIterator();
        while(lt.hasNext())
        {
            res.add(lt.next().index);
        }
        return res;
    }
    
    
}
class Pizza
{
    int index;
    int value;
    Pizza(int value, int index)
    {
        this.value = value;
        this.index = index;
    }
}
class PizzaComparator implements Comparator<Pizza>
{
    
    public int compare(Pizza p1 , Pizza p2)
    {
        if(p1.value==p2.value)
            return 0;
        if(p1.value<p2.value)
            return 1;
        if(p1.value>p2.value)
            return -1;
        return 2;
    }
}