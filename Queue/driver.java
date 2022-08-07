package Queue;

public class driver 
{
    public static void main(String args[])
    {
        // using_array a = new using_array(5);
        // a.enqueue(12);
        // a.enqueue(13);
        // a.enqueue(14);
        // a.enqueue(15);
        // a.enqueue(16);
        // //System.out.println(a.deqeue());
        // a.print();
        // stack_using_queue<Double> q = new stack_using_queue<>();
        // int i = 0;
        // while(i<=10)
        // {
        //     q.push(Math.random());
        // }
        // ctrl+k+c
        // ctrl+k+u
        using_stack q = new using_stack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        System.out.println(q.size()); 
        System.out.println(q.peek());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        
    }
}
