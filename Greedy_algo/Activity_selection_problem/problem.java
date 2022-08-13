package Greedy_algo.Activity_selection_problem;
import java.util.Arrays;
public class problem 
{
    public static void main(String args[])
    {
        Activity arr[] ={ new Activity(12, 25), 
                          new Activity(10, 20), 
                          new Activity(20, 30)};
                          //(10,20)(12,25)(20,30)
        int res = Activity_selection(arr);
        System.out.println(res);
    }
    public static int Activity_selection(Activity arr[])
    {
        Arrays.sort(arr,new Mycomp());
        int res = 1;
        int pre = 0;
        for(int i = 1;i<=arr.length-1;i++)
        {
            if(arr[i].start>=arr[pre].finish)
                {
                    pre = i;
                    res++;
                }
        }
        return res;
    }
}
