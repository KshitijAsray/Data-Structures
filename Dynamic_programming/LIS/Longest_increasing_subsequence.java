package Dynamic_programming.LIS;

import java.util.ArrayList;

public class Longest_increasing_subsequence 
{
    public static void main(String args[])
    {
        int nums[] = {3,2,-5,-6,-1,4};
        int n = nums.length;
        int res = LIS(nums, n);
        System.out.println(res);
    }
    public static int LIS(int nums[],int n)
    {
        int lis[] = new int[n];
        lis[0] = 1;
        for(int i = 1;i<n;i++)
        {
            lis[i] = 1;
            for(int j = i-1;j>=0;j--)
            {
                if(nums[i]>nums[j])
                    lis[i] = Math.max(lis[i], lis[j]+1);
            }
        }
        int max = lis[0];
        for(int i = 0;i<lis.length;i++)
            max = Math.max(max, lis[i]);
        return max;
    }
    public static int ceil_Index(ArrayList<Integer> tail,int lb,int ub,int key)
    {
        while(lb<ub)
        {
            int mid = lb+(ub-lb)/2;
            if(key>=tail.get(mid))
                lb = mid+1;
            else
                ub = mid;
        }
        return ub;
    }
    public static int LIS_optimized(int nums[],int n)
    {
        ArrayList<Integer> tail = new ArrayList<>();
        tail.add(0,nums[0]);
        for(int i = 1;i<n;i++)
        {
            if(nums[i]>tail.get(tail.size()-1))
                tail.add(nums[i]);
            else
            {
                int c = ceil_Index(tail, 0, tail.size()-1,nums[i]);
                tail.set(c, nums[i]);
            }
        }
        return tail.size();
    }
}
