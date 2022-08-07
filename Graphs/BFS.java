package Graphs;
import java.util.*;
public class BFS 
{   
    public static void add_edges(ArrayList<ArrayList<Integer>> arr, int v, int u)
    {
        arr.get(v).add(u);
        arr.get(u).add(v);
    }
    public static void BFS_algo(ArrayList<ArrayList<Integer>> arr,boolean visited[],int s)
    {
        Queue<Integer> q1 = new LinkedList<>();
        visited[s] = true;
        q1.add(s);
        while(q1.isEmpty()==false)
        {
            int u = q1.remove();
            System.out.print(u+" ");
            for(int v: arr.get(u))
            {
                if(visited[v]==false)
                {
                    visited[v]=true;
                    q1.add(v);
                }
            }
        }
    }
    public static int BFS_disconnected(ArrayList<ArrayList<Integer>> arr , int v)
    {
        int count = 0;
        boolean visited[] = new boolean[v+1];
        for(int i = 0;i<v;i++)
        {
            if(visited[i]==false)
            {
                count++;
                BFS_algo(arr,visited,i);
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int v = 7;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(v); 
        for(int i = 0;i<v;i++)
            arr.add(new ArrayList<>());
            add_edges(arr,0,1); 
        	add_edges(arr,0,2); 
        	add_edges(arr,2,3); 
        	add_edges(arr,1,3); 
        	add_edges(arr,4,5);
        	add_edges(arr,5,6);
        	add_edges(arr,4,6);
            int no_of_islands = BFS_disconnected(arr, v);
            System.out.println();
            System.out.println(no_of_islands);
		
    }
    
}
