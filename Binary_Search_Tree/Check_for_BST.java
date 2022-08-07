package Binary_Search_Tree;
import java.util.ArrayList;
public class Check_for_BST 
{
    public static boolean check_BST_1(TreeNode<Integer> root)
    {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        return Check_BST_Main_1(root, min, max);
    }
    public static boolean Check_BST_Main_1(TreeNode<Integer> root, int min , int max)
    {
        if(root==null)
            return true;
        return(root.key>min&&root.key<max&&Check_BST_Main_1(root.left, min, root.key)&&Check_BST_Main_1(root.right, root.key, max));
    }
    public static void Inorder(TreeNode<Integer> root,ArrayList<Integer> arr)
    {
        if(root!=null)
        {
            Inorder(root.left,arr);
            arr.add(root.key);
            Inorder(root.right, arr);
        }
    }
    public static int pre = Integer.MAX_VALUE;
    public static boolean Check_BST_2(TreeNode<Integer> root)
    {
        if(root==null)
            return true;
        if(Check_BST_2(root.left)==false)
            return false;
        if(root.key<=pre)
            return false;
        pre = root.key;
        return Check_BST_2(root.right);
    }
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
        System.out.println(Check_BST_2(node));
        System.out.println(check_BST_1(node));
    }

}

