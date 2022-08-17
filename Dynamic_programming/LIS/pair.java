package Dynamic_programming.LIS;

import java.util.Comparator;

public class pair 
{
    int north,south;
    pair(int north,int south)
    {
        this.north = north;
        this.south = south;
    }
}
class Mycomp implements Comparator<pair>
{

    @Override
    public int compare(pair o1, pair o2) 
    {
        if(o1.north==o2.north)
            return o1.south-o2.south;
        return o1.north-o2.north;
    }
    
}
