package Practice;

public class quick_sort 
{
    public static void main(String args[])
    {
        int arr[] = {12,32,123,43,54,21,321,98,789};
        int size = arr.length;
        quick_sort ob = new quick_sort();
        ob.print(arr);
        ob.quick(arr, 0, size-1);
        ob.print(arr);
    }
    public int Hoare_Partition(int arr[],int low,int high)
    {
        int i = low-1,j = high+1;
        int pivot = arr[low];
        while(true)
        {
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)
                return i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public void quick(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pivot = Hoare_Partition(arr, low, high);
            quick(arr, low, pivot);
            quick(arr, pivot+1, high);
        }
    }
    public void print(int arr[])
    {
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
    }
}
