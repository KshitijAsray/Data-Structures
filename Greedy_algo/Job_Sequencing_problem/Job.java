package Greedy_algo.Job_Sequencing_problem;
import java.util.Comparator;
public class Job
{
    int deadline,profit;
    String jobid;
    Job(int deadline,int profit,String jobid)
    {
        this.deadline = deadline;
        this.profit = profit;
        this.jobid = jobid;
    }
}
class Mycomp implements Comparator<Job>
{

    @Override
    public int compare(Job o1, Job o2) 
    {
        return (o2.profit-o1.profit);
    }

}
