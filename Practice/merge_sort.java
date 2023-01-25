package Practice;

public class merge_sort 
{
    public static void main(String[] args)
    {
        int arr[] = {12,32,123,43,54,21,321,98,789};
        int size = arr.length;
        merge_sort ob = new merge_sort();
        ob.print(arr);
        ob.merge(arr, 0, size-1);
        ob.print(arr);
    }
    public void merge(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid = low+(high-low)/2;
            merge(arr, low, mid);
            merge(arr, mid+1, high);
            merge_array(arr, low, high, mid);
        }
    }
    public void merge_array(int arr[],int low,int high,int mid)
    {
        int left_size = mid-low+1;
        int right_size = high-mid;
        int left[] = new int[left_size];
        int right[] = new int[right_size];
        for(int i = 0;i<left_size;i++)
            left[i] = arr[low+i];
        for(int i = 0;i<right_size;i++)
            right[i] = arr[mid+1+i];
        int i = 0,j = 0,k=low;
        while(i<left_size&&j<right_size)
        {
            if(left[i]<=right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left_size)
            arr[k++] = left[i++];
        while(j<right_size)
            arr[k++] = right[j++];

    }
    public void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
    }
}