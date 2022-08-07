package Deque;

public class petrol 
{
    public static void main(String args[])
    {
        int []p1 = {4,8,7,4};
        int []d1 = {6,5,3,5};
        int p2[] = {4,8};
        int d2[] = {5,6};
        int p3[] = {8,9,4};
        int d3[] = {5,10,12};
        petrol p = new petrol();
        p.petrol_problem(p1, d1);
        p.petrol_problem(p2, d2);
        p.petrol_problem(p3, d3);
    }
    void print(int arr[])
    {
        for(int i:arr)
            System.out.println(i);
    }
    int[] petrol_problem(int petrol[],int distance[])
    {
        int curr_petrol = petrol[0];
        int total_petrol = 0;
        for(int i = 0;i<petrol.length;i++)
        {
            if(petrol[i]<distance[i])
                continue;
            total_petrol = total_petrol+curr_petrol;
            curr_petrol = curr_petrol+(petrol[i+1]-distance[i]);

        }
        return petrol;
    }
}
