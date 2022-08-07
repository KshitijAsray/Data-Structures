package Graphs;
import java.util.*;
public class adjacency_list 
{
    public static void add_edge(ArrayList<ArrayList<Integer>> arr,int u,int v)
    {
        arr.get(u).add(v);
        arr.get(v).add(u);
    }
    public static void print_graph(ArrayList<ArrayList<Integer>> arr)
    {
        for(int i = 0;i<arr.size();i++)
        {
            for(int j = i;j<arr.get(i).size();j++)
                System.out.print(arr.get(i).get(j)+" ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(4);
        for(int i = 0;i<5;i++)
        {
            arr.add(new ArrayList<>());
        }
        add_edge(arr, 0, 1);
        add_edge(arr, 0, 2);
        add_edge(arr, 1, 2);
        add_edge(arr, 1, 3);
        print_graph(arr);
    }
}
