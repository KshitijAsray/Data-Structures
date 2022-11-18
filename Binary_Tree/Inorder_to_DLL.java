package Binary_Tree;

import java.util.ArrayList;

public class Inorder_to_DLL 
{
    static ArrayList<TreeNode<Integer>> arr = new ArrayList<>();
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(10);
        node.left = new TreeNode<Integer>(20);
        node.right = new TreeNode<Integer>(30);
        node.right.right = new TreeNode<Integer>(70);
        node.right.left = new TreeNode<Integer>(60);
        node.right.right.left = new TreeNode<Integer>(80);
        node.right.right.left.right = new TreeNode<Integer>(90);
        node.left.left = new TreeNode<Integer>(50);
        node.left.right = new TreeNode<Integer>(40);
        node.left.left.left = new TreeNode<Integer>(100);
        TreeNode<Integer> arr = bToDLL(node);
        while(arr.right!=null)
        {
            System.out.println(arr.key);    
            arr = arr.right;     
        }
    }
    public static TreeNode<Integer> bToDLL(TreeNode<Integer> root)
    {
        Inorder(root,arr);
        for(TreeNode<Integer> i : arr)
            System.out.print(i.key+" ");
        System.out.println();
		TreeNode<Integer> head = arr.get(0);
		for(int i = 0;i<arr.size()-1;i++)
		{
            arr.get(i).right = arr.get(i+1);
            arr.get(i+1).left = arr.get(i);
		}
		return head;
    }
    
    public static void Inorder(TreeNode<Integer> root,ArrayList<TreeNode<Integer>> arr)
    {
        if(root!=null)
        {
            Inorder(root.left, arr);
            arr.add(new TreeNode<Integer>(root.key));
            Inorder(root.right,arr);
        }
    }
}
