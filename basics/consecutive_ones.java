package basics;
public class consecutive_ones 
{
    public static int consecutive(int arr[])
    {
        int c = 0;
        for(int i : arr)
        {
            if(i==1)
                c++;
            else
                c=0;
        }
        return c;
    }
    public static void main(String args[])
    {
        int arr1[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int arr2[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println(consecutive(arr1));
        System.out.println(consecutive(arr2));
    }
}