package Arr;

import java.util.ArrayList;
import java.util.Arrays;

public class Stock_buy_sell 
{
    public static void main(String args[])
    {
        int stocks[] = {100,180,260,310,40,535,695};
        int N = stocks.length;
        ArrayList<ArrayList<Integer>> res = stockBuySell(stocks, N);
        System.out.println(res);
    }
    public static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) 
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int index_buy = 0,index_sell = 0;
        for(int i = 1;i<n;i++)
        {
            if(A[i]>A[i-1])
                    index_sell = i;
            else
            {
                System.out.println(i);
                res.add(new ArrayList<Integer>(Arrays.asList(index_buy,index_sell)));
                index_buy = i;
                index_sell = i;
            }
        }
        if(index_sell==n-1)
            res.add(new ArrayList<>(Arrays.asList(index_buy,index_sell)));
        return res;
    }
}
