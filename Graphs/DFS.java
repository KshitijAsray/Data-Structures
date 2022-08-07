package Graphs;
import java.util.*;
public class DFS 
{
    public static void addEdge(ArrayList<ArrayList<Integer>> arr,int v,int u)
    {
        arr.get(v).add(u);
        arr.get(u).add(v);
    }
    public static void main(String...args)  
    {
        int v = 5;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(v);
        for(int i = 0;i<v;i++)
            arr.add(new ArrayList<>());
        addEdge(arr,0,1); 
        addEdge(arr,0,2); 
        addEdge(arr,1,2);
        addEdge(arr,3,4);
        int no_of_islands = DFS_algo(arr, v);
        System.out.println();
        System.out.print(no_of_islands);
    }
    public static void DFS_REC(ArrayList<ArrayList<Integer>> arr,int s,boolean visited[])
    {
        visited[s] = true;
        System.out.print(s+" ");
        for(int i:arr.get(s))
        {
            if(visited[i]==false)
                DFS_REC(arr, i,visited);
        }
    }
    public static int DFS_algo(ArrayList<ArrayList<Integer>> arr, int v)
    {
        boolean visited[] = new boolean[v];
        int count = 0;
        for(int i = 0;i<v;i++)
        {
            if(visited[i]==false)
            {
                DFS_REC(arr, i, visited);
                count++;
            }
                
        }
        return count;
    }
}
