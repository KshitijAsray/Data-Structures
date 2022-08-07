package Binary_Heaps;
import java.util.PriorityQueue;
public class Max_item_with_given_sum
{
    public static int max_sum(int arr[], int sum)
    {
        int res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i< arr.length;i++)
            pq.add(arr[i]);
        while(pq.isEmpty()==false)
        {
            int element = pq.poll();
            if(element<=sum)
            {
                res++;
                sum = sum-element;
                if(sum<0)
                    break;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int arr[] = {1,12,5,111,200};
        int sum[] = {10,35};
        int arr1[] = {20,10,5,30,100};
        System.out.println(max_sum(arr, sum[0]));
        System.out.println(max_sum(arr1, sum[1]));
    }
}