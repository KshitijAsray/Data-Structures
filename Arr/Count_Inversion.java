package Arr;
import java.util.Arrays;
public class Count_Inversion 
{
    public static void main(String args[])
    {
        int arr[] = {2,4,1,3,5};
        int n = arr.length;
        int res = count_Inv(arr,0,n-1);
        System.out.println(res);
    }
    public static int count_Inv(int arr[],int start,int end)
    {
        int res = 0;
        if(start<end)
        {
            int mid = (start+end)/2;
            res += count_Inv(arr, start, mid);
            res += count_Inv(arr, mid+1, end);
            res += count(arr, start, mid ,end);
        }
        return res;
    }
    public static int count(int[] arr, int start, int mid ,int end) 
    {
        int res = 0,i=0,j=0,k=start;
        int left[] = Arrays.copyOfRange(arr, start, mid+1);
        int right[] = Arrays.copyOfRange(arr, mid+1, end+1);
        int m = left.length;
        int n = right.length;
        while(i<m&&j<n)
        {
            if(left[i]<=right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                res = res+m-i;
                j++;
            }
            k++;
        }
        while(i<m)
            arr[k++]=left[i++];
        while(j<n)
            arr[k++]=right[j++];
        return res;
    }
}
