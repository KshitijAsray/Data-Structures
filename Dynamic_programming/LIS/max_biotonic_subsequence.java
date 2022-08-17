package Dynamic_programming.LIS;

// first incresing then decreasing sequence
    // find the lis of the array (left to right traversal)
    // find the lds of the array (right to left traversal)
    // sum of the max of the two - 1
public class max_biotonic_subsequence 
{
    public static void main(String args[])
    {
        int nums[] = { 12,20,7,9,6,9,21,12,3,12,16,1,27};
        int n = nums.length;
        int res = biotonic(nums, n);
        System.out.println(res);
    }
    public static int biotonic(int nums[],int n)
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
        int i,j;
        int lds[] = new int[n];
        lds[n-1] = 1;
        for (i = n-2; i >= 0; i--)
        {
            lds[i] = 1;
            for (j = n-1; j > i; j--)
            {
                if(nums[i]>nums[j])
                    lds[i] = Math.max(lds[i], lds[j]+1);
            }
        }
        int max = lis[0]+lds[0]-1;
        for(i = 0;i<lds.length;i++)
        {
            max = Math.max(max, lis[i]+lds[i]-1);
        }
        return max;
    }
}
