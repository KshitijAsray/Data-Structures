package Greedy_algo.Job_Sequencing_problem;
// wrong
import java.util.ArrayList;
import java.util.Arrays;

public class problem 
{
    public static void main(String args[])
    {
        Job arr[] = {new Job(2, 100,"a"),
                     new Job(1, 19,"b"),
                     new Job(2, 27,"c"),
                     new Job(1, 25,"d"),
                     new Job(3, 15,"e")};
        System.out.println(job_sequencing(arr));
        
    }
    public static int max(Job arr[])
    {
        int max = 0;
        for(int i = 0;i<arr.length;i++)
            max = Math.max(max, arr[i].deadline);
        return max;
    }
    public static int job_sequencing(Job arr[])
    {
        int cap = max(arr);
        boolean visited[] = new boolean[cap+1];
        String profit[] = new String[cap+1];
        ArrayList<String> profit_final = new ArrayList<>();
        int max_profit = 0;
        Arrays.sort(arr,new Mycomp());
        for(int i = 0;i<arr.length;i++)
        {
            if(cap!=0&&visited[arr[i].deadline]==false)
            {
                profit[arr[i].deadline] = arr[i].jobid;
                max_profit += arr[i].profit;
                cap--;
                visited[arr[i].deadline]=true;
            }
        }
        for(String i:profit)
        {
            if(i==null)
                continue;
            else
                profit_final.add(i);
        }
        System.out.println(profit_final);
        return max_profit;

    }
}
