package Binary_Tree;
import java.util.*;
public class LCA 
{
    boolean findpath(TreeNode<Integer> root, ArrayList<TreeNode<Integer>> arr,int n)
    {
        if(root==null)
            return false;
        arr.add(root);
        if(root.key==n)
            return true;
        if(findpath(root.left, arr, n)||findpath(root.right, arr, n))
            return true;
        arr.remove(arr.size()-1);
        return false;
    }
    TreeNode<Integer> LCA_1(TreeNode<Integer> root , int n1, int n2)
    {
        ArrayList<TreeNode<Integer>> path1 = new ArrayList<>();
        ArrayList<TreeNode<Integer>> path2 = new ArrayList<>();
        if(findpath(root, path1, n1)==false||findpath(root, path2, n2)==false)
            return null;
        for(int i = 0;i<path1.size()-1&&i<path2.size()-1;i++)
        {
            if(path1.get(i+1)!=path2.get(i+1))
                return path1.get(i+1); 
        }
        return null;
    }
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(10);
        node.left = new TreeNode<Integer>(15);
        node.left.left = new TreeNode<Integer>(30);
        node.right = new TreeNode<Integer>(20);
        node.right.left = new TreeNode<Integer>(40);
        node.right.right = new TreeNode<Integer>(50);
        node.right.left.left = new TreeNode<Integer>(60);
        node.right.left.right = new TreeNode<Integer>(70);
        LCA l = new LCA();
        System.out.println(l.LCA_1(node, 50, 70).key);
    } 
}
