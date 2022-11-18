package Arr;
import java.util.ArrayList;

class Spiral_traversal_2D_matrix
{
    public static void main(String args[])
    {
        int r = 3,c = 4,k=1;
        int arr[][] = new int[r][c];
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                arr[i][j] = k;
                k++;
            }
        }
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
        ArrayList<Integer> res = spirallyTraverse(arr, r, c);
        System.out.println(res);
    }
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int minrow = 0,mincol = 0;
        int maxrow = r-1,maxcol = c-1;
        int tot = r*c;
        int cnt = 0;
        while(cnt<tot)
        {
            for(int i = mincol,j = minrow;i<=maxcol;i++)
            {
                //System.out.println("top");
                res.add(matrix[j][i]); 
                cnt++;
            }
            minrow++;
            for(int i = minrow,j = mincol;i<=maxrow;i++)
            {
                //System.out.println("right");
                //System.out.println(i+" "+j);
                res.add(matrix[i][j]);
                cnt++;
            }
            maxcol--;
            for(int i = maxcol,j = maxrow;i>=mincol;i--)
            {
                //System.out.println("bottom");
                res.add(matrix[j][i]);
                cnt++;
            }
            maxrow--;
            for(int i = maxrow,j = mincol;i>=minrow;i--)
            {
                //System.out.println("left");
                res.add(matrix[i][j]);
                cnt++;
            }
            mincol++;   
            
        }
        return res;
    }
}