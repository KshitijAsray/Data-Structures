package Extras;
public class jewel_maze 
{
    static int n;
    public static void main(String args[])
    {
        //Scanner ob = new Scanner(System.in);
        //int m = ob.nextInt();
        int m = 6;
        n = m;
        //int maze[][] = new int[m][m];
        int path[][] = new int[m][m];
        int visited[][] = new int[m][m];
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<m;j++)
            {
                //maze[i][j] = ob.nextInt();
                path[i][j] = 0;
                visited[i][j] = 0;
            }
        }
        int maze[][] = {{0 ,1 ,2 ,1, 0 ,0},
                        {0, 1, 0 ,0 ,0, 1},
                        {0 ,1 ,2, 1, 2, 1},
                        {0 ,2 ,0 ,1 ,0, 2},
                        {0 ,1 ,0 ,1 ,0, 1},
                        {2, 0 ,2 ,1 ,0 ,0}};
        int ans = Integer.MIN_VALUE;
        visited[0][0] = 1;
        if(maze[0][0]==2)
            jewel(maze, path, visited, 0, 0, 1, ans);
        else
            jewel(maze, path, visited, 0, 0, 0, ans);
        System.out.println("jewels are = "+ans);
        print_matrix(path);
        print_matrix(maze);
        print_matrix(visited);
    }
    static boolean isvalid(int x,int y)
    {
        if(x>=0&&y>=0&&x<n&&y<n)
            return true;
        else
            return false;
    }
    public static void print_matrix(int mat[][])
    {
        int m = mat.length;
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<m;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void jewel(int maze[][],int path[][],int visited[][],int sr,int sc,int jewel_value,int ans)
    {
        //System.out.println("newsr1");
        if(sr==n-1&&sc==n-1)
        {
            if(jewel_value>=ans)
            {
                ans = jewel_value;
                for(int i = 0;i<n;i++)
                {
                    for(int j = 0;i<n;i++)
                    {
                        if(visited[i][j]==1)
                            path[i][j] = 3;
                        else
                            path[i][j] = maze[i][j];
                    }
                }
            }
        }
        int dx[] = {1,0,-1,0};
        int dy[] = {0,1,0,-1};
        for(int i = 0;i<4;i++)
        {
            int newsr = sr + dx[i];
            int newsc = sc + dy[i];
            System.out.print(newsr+" "+newsc+" ");
            // if(isvalid(newsc, newsr)==true)
            // {
            //     if(visited[newsr][newsc]==0&&maze[newsr][newsc]==0)
            //     {
            //         visited[newsc][newsr] = 1;
            //         jewel(maze, path, visited, newsr, newsc, jewel_value, ans);
            //         visited[newsr][newsc] = 0;
            //     }
            //     if(visited[newsr][newsc]==0&&maze[newsr][newsc]==2)
            //     {
            //         visited[newsc][newsr] = 1;
            //         jewel(maze, path, visited, newsr, newsc, jewel_value+1, ans);
            //         visited[newsc][newsr] = 0;
            //     }
            // }
        }
    }
}
