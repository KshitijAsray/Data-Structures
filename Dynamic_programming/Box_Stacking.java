package Dynamic_programming;

import java.util.*;

public class Box_Stacking 
{
    public static void main(String args[])
    {
        int length[] = {7,3,6,32};
        int width[] = {6,2,5,12};
        int height[] = {4,1,4,10};
        int N = 4;
        int res = Box_Stacking_dp(height, width, length, N);
        System.out.println(res);
    }
    public static int Box_Stacking_dp(int height[],int width[],int length[],int N)
    {
        Box box[] = new Box[N*3];
        for(int i = 0;i<N;i++)
        {
            box[3*i] = new Box(length[i],Math.max(width[i], height[i]), Math.min(width[i], height[i]));
            box[3*i+1] = new Box(height[i], Math.max(length[i], width[i]), Math.min(length[i], width[i]));
            box[3*i+2] = new Box(width[i], Math.max(length[i], height[i]), Math.min(length[i], height[i]));
        }
        for(int i = 0;i<N*3;i++)
            box[i].area = box[i].l*box[i].w;
        Arrays.sort(box, new Mycomp());
        for(Box i : box)
            System.out.println(i.h+" "+i.l+" "+i.w);
        int msh[] = new int[N*3];
        Arrays.fill(msh,0);
        for(int i = 0;i<N*3;i++)
        {
            int val = 0;
            Box box2 = box[i];
            for(int j = 0;j<i;j++)
            {
                Box pBox = box[j];
                if(box2.w<pBox.w&&box2.l<pBox.l)
                    val = Math.max(val,msh[j]);
            }
            msh[i] = val+box2.h;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<N*3;i++)
            max = Math.max(max,msh[i]);
        return max;
    }
}
