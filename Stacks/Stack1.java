package Stacks;
public class Stack1 
{
  int cap;
  int top;
  int arr[];
    Stack1(int c)
    {
       cap = c;
       top = -1;
       arr =  new int[c];
    }
    void push(int x)
    {
      if(top==cap-1)
      {
        System.out.println("Stack is full");
      }
      top++;
      arr[top] = x;
    }
    int pop()
    {
      if(top==-1)
      {
        System.out.println("Stack is Empty");
        return -1;
      }
        
      int res = arr[top];
      top--;
      return res;
    }
    int size()
    {
      return top+1;
    }
    boolean isempty()
    {
      if(top==-1)
        return true;
      else
        return false;
    }
}
