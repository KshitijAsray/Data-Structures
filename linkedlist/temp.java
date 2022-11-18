package linkedlist;
import java.util.Scanner;
public class temp 
{
	public static void print(Node<Integer>headNode)
	{
		while(headNode!=null)
		{
			System.out.print(headNode.data+" ");
			headNode = headNode.next;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		middleListNode(inputListNode());
	}
	 public static Node<Integer> inputListNode()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER THE LIST ELEMENTS");
		int data = ob.nextInt();
		Node<Integer> headListNode = null,tailListNode = null;
		while(data!=-1)
		{
			Node<Integer> ListNode1 = new Node<Integer>(data);
			if(headListNode==null)
			{
				headListNode = ListNode1;
				tailListNode = ListNode1;
			}
			else 
			{
				tailListNode.next = ListNode1;
				tailListNode = ListNode1;
			}
			data = ob.nextInt();
		}
		ob.close();
		print(headListNode);
		return headListNode;
	}
	public static Node<Integer> middleListNode(Node<Integer> head) 
    {
        Node<Integer> temp1 = head;
        int len = length(head);
        if(len%2==0)
        {
            int r = (len/2)+1;
            for(int x =1;x<r;x++)
            {
                temp1 = temp1.next;
            }
            print(temp1);
            return temp1;
        }
        else
        {
			Node<Integer> slow = head,fast = head;
            while(fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            print(slow);
            return slow;
        }
    }
    public static int length(Node<Integer> l3)
    {
        int length = 0;
        while(l3!=null)
        {
        	length++;
            l3 = l3.next;
           
            
        }
        System.out.println(length);
        return length;
    }
}
