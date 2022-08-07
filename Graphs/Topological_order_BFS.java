package Graphs;
import java.util.*;
public class Topological_order_BFS 
{
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
	}
    public static int[] get_In_degree(ArrayList<ArrayList<Integer>> arr, int v)
    {
        int In_degree[] = new int[v];
        for(int i = 0;i<v;i++)
        {
            for(int j:arr.get(i))
                In_degree[j]++;
        }
        return In_degree;
    }
    public static void Topological_Sorting(ArrayList<ArrayList<Integer>> arr,int v)
    {
        int In_degree[] = get_In_degree(arr, v);
        Queue<Integer> q1 = new LinkedList<>();
        for(int i = 0;i<v;i++)
        {
            if(In_degree[i]==0)
                q1.add(i);
        }

        while(q1.isEmpty()==false)
        {
            int u = q1.poll();
            System.out.print(u+" ");
            for(int i:arr.get(u))
            {
                if(--In_degree[i]==0)
                    q1.add(i);
            }
        }
    }
    public static void main(String[] args) 
	{  
		int V = 7; 
		ArrayList<ArrayList<Integer> > arr = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			arr.add(new ArrayList<Integer>()); 

			// addEdge(adj,0, 1); 
            // addEdge(adj,1, 3); 
            // addEdge(adj,2, 3); 
            // addEdge(adj,3, 4); 
            // addEdge(adj,2, 4);
            addEdge(arr,0, 1);
            addEdge(arr,0, 4);
            addEdge(arr,1, 2);
            addEdge(arr,4, 2);
            addEdge(arr,4, 5);
            addEdge(arr,2, 3);
            addEdge(arr,5, 3);
            //System.out.println(adj);
            // for(int i = 0;i<V;i++)
            // {
            //     for(int j :adj.get(i))
            //         System.out.print(j+" ");
            //     System.out.println();
            // }
		
		System.out.println("Following is a Topological Sort of"); 
        Topological_Sorting(arr,V);
	}
}
