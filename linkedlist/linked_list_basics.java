package linkedlist;

import java.util.Scanner;

public class linked_list_basics {

	public static void main(String[] args) 
	{
		//insertion_element();
		deletion_element();
	}
	public static void insertion_element()
	{
		Node<Integer> headNode = inputNode();
		Scanner oc  = new Scanner(System.in);
		System.out.println("ENTER THE DATA TO BE INSERTED");
		int data = oc.nextInt();
		System.out.println("ENTER THE POSITION AT WHICH DATA IS TO INSERTED");
		int pos = oc.nextInt();
		System.out.println("ENTERED LIST IS");
		print(headNode);
		Node<Integer> second_headNode = insertNode(headNode, data, pos);
		System.out.println("MODIFIED LIST IS --->");
		print(second_headNode);
		oc.close();
	}
	public static void deletion_element()
	{
		Node<Integer> headNode = inputNode();
		Scanner oc  = new Scanner(System.in);
		System.out.println("ENTER THE ELEMENT TO BE DELETED");
		int data = oc.nextInt();
		System.out.println("ENTERED LIST IS");
		print(headNode);
		Node<Integer> headNode2 = deleteNode(headNode, data);
		System.out.println("MODIFIED LIST IS --->");
		print(headNode2);
		oc.close();
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
	public static Node<Integer> insertNode(Node<Integer> headNode,int data,int pos)
	{
		Node<Integer> tempNode = headNode;
		Node<Integer> nexNode = null;
		Node<Integer> dataNode = new Node<Integer>(data);
		Node<Integer> posNode = null;
		int n = 0;
		while(tempNode!=null)
		{
			if(n==pos)
				posNode = tempNode;
			if(n==pos+1)
			{
				nexNode = tempNode;
				break;
			}
			n++;
			tempNode = tempNode.next;	
		}
		posNode.next = dataNode;
		dataNode.next = nexNode;
		return headNode;
	}
	public static Node<Integer> deleteNode(Node<Integer> headNode,int element)
	{
		Node<Integer> tempNode = headNode;
		Node<Integer> next_element  = null;
		Node<Integer> previous_element  = null;
		while(tempNode!=null)
		{
			if(tempNode.data==element)
			{
				next_element = tempNode.next;
				break;
			}
			previous_element = tempNode;
			tempNode = tempNode.next;
		}
		previous_element.next = next_element;
		return headNode;
	}
	public static void print(Node<Integer>headNode)
	{
		while(headNode!=null)
		{
			System.out.print(headNode.data+" ");
			headNode = headNode.next;
		}
		System.out.println();
	}
}