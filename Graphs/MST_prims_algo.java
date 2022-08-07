package Graphs;

import java.util.Arrays;

public class MST_prims_algo 
{
    public static void main(String[] args) 
	{  
		int graph[][] = new int[][] { { 0, 5, 8, 0}, 
    						          { 5, 0, 10, 15 }, 
    						          { 8, 10, 0, 20 }, 
    						          { 0, 15, 20, 0 },};  

		System.out.print(Prims(graph)); 
	}
    public static int Prims(int [][]graph)
    {
        int res = 0;
        int v = graph.length;
        int key[] = new int[v];
        Arrays.fill(key,Integer.MAX_VALUE);
        boolean mSet[] = new boolean[v];
        key[0] = 0;
        for(int count = 0;count<v;count++)
        {
            int u = -1;
            for(int i = 0;i<v;i++)
                if((mSet[i]==false)&&((u==-1)||(key[i]<key[u])))
                    u=i;
            mSet[u] = true;
            res += key[u];

            for(int j = 0;j<v;j++)
            {
                if((mSet[j]==false)&&(graph[u][j]!=0))
                    key[j] = Math.min(key[j],graph[u][j]);
            }
        }
        return res;
    }
}
