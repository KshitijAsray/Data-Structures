package Practice;
public class array_to_number 
{
    public static void main(String[] args)
    {
        int number = 12345;
        int arr[] = {1,2,3,4,5};
        int ans[] = number_to_array(number);
        int no = Array_to_number(arr);
        for(int i: ans)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(no);
    }
    public static int[] number_to_array(int number)
    {
        String str = String.valueOf(number);
        int arr[] = new int[str.length()];
        for(int i = 0;i<str.length();i++)
        {
            int k = Integer.parseInt(String.valueOf(str.charAt(i)));
            arr[i] = k;
        }
        return arr;
    }
    public static int Array_to_number(int[] number)
    {
        int no = 0;
        for(int i = 0;i<number.length;i++)
            no = no*10+number[i];
        return no;
    }
}
