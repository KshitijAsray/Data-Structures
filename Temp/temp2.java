package Temp;

class temp2 
{
    public static int maxOnes (int Mat[][])
    {
        int max_count = 0;
        int max_row = 0;
        for(int i = 0;i<Mat.length;i++)
        {
            int count = 0;
            for(int j = 0;j<Mat[i].length;j++)
            {
                if(Mat[i][j]==1)
                    count++;
            }
            System.out.println(count+" "+i);
            if(count>max_count)
            {
                max_count = count;
                max_row = i;
            }
            // System.out.println(max_count+" max");
        }
        return max_row;
    }
    public static void main(String args[])
    {
        int Mat[][] = {{0,1,1,1},{0,0,1,1},{0,0,1,1}};
        int n = maxOnes(Mat);
        System.out.println(n);
    }
}