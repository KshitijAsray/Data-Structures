package Binary_Heaps;

public class driver 
{
    public static void main(String args[])
    {
        int arr[] = {12,56,34,23,78,54,90,22};
        int arr1[] = {12,56,34,23,78,54,90,22};
        System.out.println("Orignal Array");
        Binary_Heaps.Heap_Sort.Print(arr);
        System.out.println();
        Binary_Heaps.Heap_Sort.Print(arr1);
        Binary_Heaps.Heap_Sort.Ascending_Heap_Sort(arr);
        Binary_Heaps.Heap_Sort.Desending_Heap_Sort(arr1);
        System.out.println();
        System.out.println("Ascending Order");
        Binary_Heaps.Heap_Sort.Print(arr);
        System.out.println();
        System.out.println("Desending Order");
        Binary_Heaps.Heap_Sort.Print(arr1);
    }
}
