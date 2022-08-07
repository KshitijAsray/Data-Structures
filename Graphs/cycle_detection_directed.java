package Graphs;
import java.util.ArrayList;
public class cycle_detection_directed 
{
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	}
    public static boolean DFS_REC(ArrayList<ArrayList<Integer>> arr, int s, boolean visited[],boolean backedge[])
    {
        visited[s] = true;
        backedge[s] = true;
        for(int u:arr.get(s))
        {
            if(visited[s]==false&&DFS_REC(arr, u, visited, backedge)==true)
                return true;
            else if(backedge[s]==true)
                return true;
        }
        backedge[s] = false;
        return false;
    }
    public static boolean DFS(ArrayList<ArrayList<Integer>> arr, int v)
    {
        boolean backedge[] = new boolean[v];
        boolean visited[] = new boolean[v];
        for(int i = 0;i<v;i++)
        {
            if(visited[i]==false)
            {
                if(DFS_REC(arr, i, visited, backedge)==true)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
	{  
		int V = 6; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0,1); 
        	addEdge(adj,2,1); 
        	addEdge(adj,2,3); 
        	addEdge(adj,3,4); 
        	addEdge(adj,4,5);
        	//addEdge(adj,5,3);
		
		if(DFS(adj,V)==true)
    	    System.out.println("Cycle found");
    	else
    	    System.out.println("No cycle found");
	}    
}
