package Greedy_algo.Fractional_Knapsack_problem;

public class Item implements Comparable<Item> 
{
    int weight,values;
    Item(int weight,int values)
    {
        this.weight = weight;
        this.values = values;
    }
    @Override
    public int compareTo(Item o) 
    {
        return (this.weight*o.values-this.values*o.weight);
    }
    
}
