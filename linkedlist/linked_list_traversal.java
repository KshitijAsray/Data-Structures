package linkedlist;
import java.util.Scanner;
public class linked_list_traversal 
{
    public static void main(String[] args) 
	{
		//list_traversal(insert_end(inputNode(), 10));
        //list_traversal(delete_first(inputNode()));
        //list_traversal(delete_last(inputNode()));
        //list_traversal(insert(inputNode(),5,90));
        /*if(Search_iterative(inputNode(),90)==true)
            System.out.println("Found");
        else    
        System.out.println("Not Found");*/
        System.out.println(search_recursive(inputNode(),90));
	}
    public static void list_traversal(Node<Integer> headNode)
    {
        if(headNode==null)
            return;
        System.out.print(headNode.data+" ");
        list_traversal(headNode.next);
    }
    public static Node<Integer> inputNode()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("ENTER THE LIST ELEMENTS");
		int data = ob.nextInt();
		Node<Integer> headNode = null,tailNode = null;
		while(data!=-1)
		{
			Node<Integer> node1 = new Node<Integer>(data);
			if(headNode==null)
			{
				headNode = node1;
				tailNode = node1;
			}
			else 
			{
				tailNode.next = node1;
				tailNode = node1;
			}
			data = ob.nextInt();
		}
		ob.close();
		return headNode;
	}
    public static int length(Node<Integer> head)
    {
        Node<Integer> temp = head;
        int c = 0;
        if(temp==null)
            return 0;
        else
        {
            while(temp.next!=null)
            {
                c++;
                temp = temp.next; 
            }
            return c;
        }
    }
    public static Node<Integer> insert_begin(Node<Integer> head, int x)
    {
        Node<Integer> node1 = new Node<Integer>(x);
        node1.next = head;
        return node1;
    }
    public static Node<Integer> insert_end(Node<Integer> head, int x)
    {
        Node<Integer> node1 = new Node<Integer>(x);
        if(head==null)
        {
            head = node1;
            return head;
        }
        Node<Integer> node2 = head,Node3 = null;
        while(node2!=null)
        {
            Node3 = node2;
            node2 = node2.next;
        }
        Node3.next = node1;
        return head;
    }
    public static Node<Integer> delete_first(Node<Integer> head)
    {
        if(head==null)
            return null;
        return head = head.next;
    }
    public static Node<Integer> delete_last(Node<Integer> head)
    {
        if(head.next==null||head==null)
            return null;
        Node<Integer> cur = head;
        while(cur.next.next!=null)
        {
            cur = cur.next;
        }
        cur.next = null;
        return head;
    }
    public static Node<Integer> insert(Node<Integer> head, int x, int data)
    {
        Node<Integer> data1 = new Node<Integer>(data);
        int len = length(head);
        System.out.println(len);
        if(x>len+2)
            return head;
        Node<Integer> before = head,after = null;;
        for(int i = 1;i<x;i++)
        {
            before = before.next;
        }
        after = before.next.next;
        before.next = data1;
        data1.next = after;
        return head;
    }
    public static boolean Search_iterative(Node<Integer> head, int x)
    {
        Node<Integer> temp = head;
        if(temp==null)
            return false;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                System.out.println("2");
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static int search_recursive(Node<Integer> head, int x)
    {
        if(head==null)return -1;
        if(head.data==x)return 1;
        else{
            int res=search_recursive(head.next,x);
            if(res==-1)return -1;
            else return res+1;
        }
        
    }
}
