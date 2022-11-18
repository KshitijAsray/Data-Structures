package Binary_Heaps;

public class driver 
{
    public static void main(String args[])
    {
        // int arr[] = {12,56,34,23,78,54,90,22};
        // int arr1[] = {12,56,34,23,78,54,90,22};
        // System.out.println("Orignal Array");
        // Binary_Heaps.Heap_Sort.Print(arr);
        // System.out.println();
        // Binary_Heaps.Heap_Sort.Print(arr1);
        // Binary_Heaps.Heap_Sort.Ascending_Heap_Sort(arr);
        // Binary_Heaps.Heap_Sort.Desending_Heap_Sort(arr1);
        // System.out.println();
        // System.out.println("Ascending Order");
        // Binary_Heaps.Heap_Sort.Print(arr);
        // System.out.println();
        // System.out.println("Desending Order");
        // Binary_Heaps.Heap_Sort.Print(arr1);
        Max_Heap ob = new Max_Heap(10);
        // ob.insert(10);
        // ob.insert(80);
        // ob.insert(67);
        // ob.insert(60);
        // ob.insert(90);
        // System.out.println(ob.size);
        // ob.print();
        // System.out.println(ob.Extract_Max());
        // ob.Delete(2);
        // ob.print();
        int arr1[] = {12,34,43,21,13,44,89,32};
        ob.Build_Heap(arr1);
        
    }
}
