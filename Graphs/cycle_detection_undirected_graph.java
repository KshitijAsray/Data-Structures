package Graphs;
import java.util.ArrayList;
public class cycle_detection_undirected_graph 
{
    public static void addEdge(ArrayList<ArrayList<Integer>> arr, int v, int u)
    {
        arr.get(v).add(u);
        arr.get(u).add(v);    
    }
    public static boolean DFS_algo(ArrayList<ArrayList<Integer>> arr,int v)
    {
        boolean visited[] = new boolean[v];
        for(int i = 0;i<v;i++)
        {
            if(visited[i]==false)
            {
                if(DFS_REC(arr,visited,i,-1)==true)
                    return true;
            }
        }
        return false;
    }
    public static boolean DFS_REC(ArrayList<ArrayList<Integer>> arr, boolean visited[],int s,int parent)
    {
        visited[s] = true;
        for(int u : arr.get(s))
        {
            if(visited[u]==false)
            {
                if(DFS_REC(arr, visited, u, s)==true)
                    return true;
            }
                else if(u!=parent)
                    return true;
        }
        return false;
    }
    public static void main(String...args)  
    {
        int v = 6;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(v);
        for(int i = 0;i<v;i++)
            arr.add(new ArrayList<>());
            addEdge(arr,0,1); 
        	addEdge(arr,1,2); 
        	addEdge(arr,2,4); 
        	addEdge(arr,4,5); 
        	//addEdge(arr,1,3);
        	addEdge(arr,2,3);
            if(DFS_algo(arr, v)==true)
                System.out.println("Cycle Exists");
            else
                System.out.println("Does not Exists");
    }
}
