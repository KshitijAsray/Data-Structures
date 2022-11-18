package Practice;
public class driver_linked_list 
{
    public static void main(String args[])
    {
        linked_list<Integer> l1 = new linked_list<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(5,90);
        System.out.println(l1.Contains(1));
        System.out.println(l1.size());
        l1.print();
    }   
}
