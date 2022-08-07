package Binary_Search_Tree;
import java.util.*;
public class Vertical_sum_BST 
{
    public static void Vertical_sum(TreeNode<Integer> root, TreeMap<Integer,Integer> mp, int hd)
    {
        if(root==null)
            return;
        Vertical_sum(root.left, mp,hd-1);
        int previous_sum = (mp.get(hd)==null)? 0 : mp.get(hd);
        mp.put(hd, previous_sum+root.key);
        Vertical_sum(root.right, mp, hd+1);
    }
    public static void Vertical_sum_1(TreeNode<Integer> root)    
    {
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        Vertical_sum(root, mp, 0);
        for(Map.Entry<Integer,Integer> iter : mp.entrySet())
        {
            System.out.print(iter.getKey()+"->"+iter.getValue()+" ,");
        }
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
        Vertical_sum_1(node);
    }
}
