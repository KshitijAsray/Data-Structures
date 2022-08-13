package Greedy_algo.Fractional_Knapsack_problem;

import java.util.Arrays;

public class problem 
{
        public static void main(String args[])
        {
            Item arr[] = {new Item(10, 60), 
                          new Item(40, 40), 
                          new Item(20, 100),
                          new Item(30, 120)};
            System.out.println(knapsack(arr,50));
        }
        public static double knapsack(Item arr[],int knap_weight)
        {
            Arrays.sort(arr);
            double max_weight = 0;
            for(int i = 0;i<arr.length;i++)
            {
                if(arr[i].weight<=knap_weight)
                {
                    max_weight += arr[i].values;
                    knap_weight = knap_weight - arr[i].values;
                }
                else
                {
                    max_weight += arr[i].values*((double)(arr[i].values/arr[i].weight));
                    break;
                }
            }
            return max_weight;
        }
}
