package Graphs;
import java.util.*;
public class shortest_path_unweighted 
{
    public static void addEdge(ArrayList<ArrayList<Integer>> arr,int v,int u)
    {
        arr.get(v).add(u);
        arr.get(u).add(v);
    }
    public static void main(String...args)  
    {
        int v = 4;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(v);
        for(int i = 0;i<v;i++)
            arr.add(new ArrayList<>());
            addEdge(arr,0,1); 
            addEdge(arr,1,2); 
            addEdge(arr,2,3); 
            addEdge(arr,0,2); 
            addEdge(arr,1,3);
            ArrayList<Integer> distance = Shortest_path(arr, 0, v);
            System.out.println(distance);
    }
    public static ArrayList<Integer> Shortest_path(ArrayList<ArrayList<Integer>> arr, int source,int v)
    {
        ArrayList<Integer> distance = new ArrayList<>(v);
        distance.add(0, 0);
        for(int i = 1;i<v;i++)
            distance.add(i, Integer.MAX_VALUE);
        System.out.println(distance);
        boolean visited[] = new boolean[v];
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(source);
        visited[source] = true;
        while(q1.isEmpty()==false)
        {
            int u = q1.remove();
            for(int i:arr.get(u))
            {
                if(visited[i]==false)
                {
                    distance.set(i, distance.get(u)+1);
                    visited[i] = true;
                    q1.add(i);
                }
            }
        }
        return distance;
    }
}
