package Graphs;

import java.util.Arrays;

public class Dijkstra_algo 
{
    public static int[] Dijkstra(int [][]graph,int src)
    {
        int v = graph.length;
        int[] distance = new int[v];
        Arrays.fill(distance,Integer.MAX_VALUE);
        boolean finalized[] = new boolean[v];
        distance[src] = 0;
        for(int count = 0;count<v-1;count++)
        {
            int u = -1;
            for(int i = 0;i<v;i++)
                if(finalized[i]==false&&(u==-1||distance[i]<distance[u]))
                    u = i;
            finalized[u] = true;

            for(int j = 0;j<v;j++)
            {
                if(finalized[j]==false&&graph[u][j]!=0)
                    distance[j] = Math.min(distance[j],distance[u]+graph[u][j]);   
            }
        }
        return distance;
    }
    public static void print(int arr[])
    {
        for(int i: arr)
            System.out.print(i+" ");
    }
    public static void main(String args[])
    {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        print(Dijkstra(graph,0));
    }
}
