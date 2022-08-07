package Graphs;
import java.util.*;
public class shortest_path_DAG 
{
    public static void addEdge(ArrayList<ArrayList<Node<Integer,Integer>>> arr,int v,int u,int weight)
    {
        arr.get(v).add(new Node<Integer,Integer>(u,weight));
    }
    public static ArrayList<Integer> Topological_order(ArrayList<ArrayList<Node<Integer,Integer>>> arr ,int v)
    {
        int[] In_degree = new int[v];
        for(int i = 0;i<v;i++)
        {
            for(Node<Integer, Integer> j:arr.get(i))
                In_degree[j.get_ver()]++;
        }
        Queue<Integer> q1 = new LinkedList<>();
        for(int i = 0;i<v;i++)
        {
            if(In_degree[i]==0)
                q1.add(i);
        }
        ArrayList<Integer> Topological = new ArrayList<>(v);
        while(q1.isEmpty()==false)
        {
            int u = q1.poll();
            Topological.add(u);
            for(Node<Integer, Integer> i:arr.get(u))
            {
                if(--In_degree[i.get_ver()]==0)
                    q1.add(i.get_ver());
            }
        }
        return Topological;
    }
    public static ArrayList<Integer> Shortest_path(ArrayList<ArrayList<Node<Integer,Integer>>> arr,int v,int s)
    {
        ArrayList<Integer> distance = new ArrayList<>(v);
        for(int i = 0;i<v;i++)
            distance.add(i,Integer.MAX_VALUE);
        distance.set(0, 0);
        ArrayList<Integer> topological = Topological_order(arr, v);
        for(int i : topological)
        {
            for(Node<Integer,Integer> j : arr.get(i))
            {
                if(distance.get(j.get_ver())>(distance.get(i)+j.get_weight()))
                    distance.set(j.get_ver(),distance.get(i)+j.get_weight());
            }
        }
        return distance;
    }
    public static void main(String args[])
    {
        int v = 6;
        ArrayList<ArrayList<Node<Integer,Integer>>> arr = new ArrayList<>();
        for(int i = 0;i<v;i++)
            arr.add(new ArrayList<Node<Integer,Integer>>());
            addEdge(arr,0, 1, 2);
            addEdge(arr,0, 4, 1);
            addEdge(arr,1, 2, 3);
            addEdge(arr,4, 2, 2);
            addEdge(arr,4, 5, 4);
            addEdge(arr,2, 3, 6);
            addEdge(arr,5, 3, 1);
            ArrayList<Integer> short_dist = Shortest_path(arr, v,0);
            System.out.println(short_dist);
    }
}
