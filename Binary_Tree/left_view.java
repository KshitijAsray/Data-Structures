package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class left_view 
{
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
        System.out.println("Recursive");
        printleft_Recursive(node, 1);
        System.out.println();
        System.out.println("Iterative");
        printleft_Iterative(node);
    }
    static int maxlevel = 0;
    static void printleft_Recursive(TreeNode<Integer> root, int level)
    {
        if(root==null)
            return;
        if(maxlevel<level)
        {
            System.out.print(root.key+" ");
            maxlevel = level;
        }
        printleft_Recursive(root.left, level+1);
        printleft_Recursive(root.right, level+1);
    }
    static void printleft_Iterative(TreeNode<Integer> root)
    {
        if(root==null)
            return;
        Queue<TreeNode<Integer>> q1 = new LinkedList<>();
        q1.add(root);
        while(q1.isEmpty()==false)
        {
            int count = q1.size();
            for(int i = 0;i<count;i++)
            {
                TreeNode<Integer> curTreeNode = q1.remove();
                if(i==0)
                    System.out.print(curTreeNode.key+" ");
                if(curTreeNode.left!=null)
                    q1.add(curTreeNode.left);
                if(curTreeNode.right!=null)
                    q1.add(curTreeNode.right);
            }
        }
    }    
}
