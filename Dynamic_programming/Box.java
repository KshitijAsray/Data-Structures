package Dynamic_programming;

import java.util.Comparator;

public class Box 
{
    int l,w,h,area;
    Box(int l,int w,int h)
    {
        this.l = l;
        this.w = w;
        this.h = h;
    }
}
class Mycomp implements Comparator<Box>
{
    @Override
    public int compare(Box o1, Box o2) {
        
        return o2.area-o1.area;
    }
}
