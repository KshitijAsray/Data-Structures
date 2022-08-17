package Dynamic_programming.LIS;

public class Max_sum_LIS 
{
    public static void main(String args[])
    {
        int nums[] = {3,4,2,8,10,5,1};
        int n = nums.length;
        int res = LIS(nums, n);
        System.out.println(res);
    }
    public static int LIS(int nums[],int n)
    {
        int msis[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            msis[i] = nums[i];
            for(int j = i-1;j>=0;j--)
            {
                if(nums[i]>nums[j])
                    msis[i] = Math.max(msis[i], msis[j]+nums[i]);
            }
        }
        int max = msis[0];
        for(int i = 0;i<msis.length;i++)
            max = Math.max(max, msis[i]);
        return max;
    }
}
