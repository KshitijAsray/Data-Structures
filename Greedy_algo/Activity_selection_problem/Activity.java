package Greedy_algo.Activity_selection_problem;

import java.util.Comparator;

public class Activity 
{
    public int finish,start;
    public Activity(int start,int finish)
    {
        this.finish = finish;
        this.start = start; 
    }
    public int get_start()
    {
        return start;
    }
    public int get_finish()
    {
        return finish;
    }
}
class Mycomp implements Comparator<Activity>
    {

        @Override
        public int compare(Activity o1, Activity o2) 
        {
            return o1.finish-o2.finish;
        }
        
    }

