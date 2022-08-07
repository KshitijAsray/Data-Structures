package Stacks;

public class two_stacks_using_array 
{
    int arr[];
    int top1,top2,cap;
    two_stacks_using_array(int c)
    {
        cap = c;
        top1 = -1;
        top2 = c;
        arr = new int[cap];
    }
    void push1(int x)
    {
        if(top1<top2-1)
        {
            top1++;
            arr[top1] = x;
        } 
        else
        {
            System.out.println("Stack overflow");
            System.exit(1);
        }    
    }
    void push2(int x)
    {
        if(top1<top2-1)
        {
            top2--;
            arr[top2] = x;
        }
        else
        {
            System.out.println("Stack overflow");
            System.exit(1);
        } 
    }
    int pop1()
    {
        if(top1==-1)
        {
            System.out.println("Underflow");
            System.exit(1);
        }  
        int res = arr[top1];
        top1--;
        return res;
    }
    int pop2()
    {
        if(top2==cap-1)
        {
            System.out.println("Underflow");
            System.exit(1);
        }
        int res = arr[top2];
        top2++;
        return res;
    }
    void print()
    {
        for(int x : arr)
            System.out.println(x);
    }
}
