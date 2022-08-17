package Dynamic_programming.LIS;

public class Minimum_deletion_to_make_array_sorted 
{
    // subtract the length of the array with the LIS of the array
    public static void main(String args[])
    {
        int nums[] = {3,4,2,8,10,5,1};
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
        return n-max;
    }
}
