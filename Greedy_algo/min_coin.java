package Greedy_algo;

import java.util.Arrays;

public class min_coin 
{
    public static void main(String args[])
    {
        int coin[] = {5, 10, 2, 1},amount = 50;
       System.out.println("Minimum coins required are:-  "+minimum_coin(coin, amount));
    }
    public static int minimum_coin(int arr[],int sum)
    {
        Arrays.sort(arr);
        int res = 0,c;
        for(int i = arr.length-1;i>=0;i--)
        {
            if(arr[i]<sum)
            {
                c =(int)Math.floor(sum/arr[i]);
                res = res+c;
                sum = sum-res*arr[i];
            }
            if(sum==0)
                break;
        }
        return res;
    }
    
}
