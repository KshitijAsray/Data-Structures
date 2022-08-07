package Binary_Tree;
import java.util.*;
public class Max_width 
{
    static int max_width(TreeNode<Integer> root)
    {
        int width = 0;
        Queue<TreeNode<Integer>> q1 = new LinkedList<>();
        if(root==null)
            return 0;
        q1.add(root);
        while(q1.isEmpty()==false)
        {
            int count = q1.size();
            for(int i = 0;i<count;i++)
            {
                width = Math.max(count, width);
                TreeNode<Integer> curTreeNode = q1.remove();
                if(curTreeNode.left!=null)
                    q1.add(curTreeNode.left);
                if(curTreeNode.right!=null)
                    q1.add(curTreeNode.right);
            }
        }
        return width;
    }
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(20);
        node.left = new TreeNode<Integer>(8);
        node.left.left = new TreeNode<Integer>(3);
        node.left.right = new TreeNode<Integer>(5);
        node.right = new TreeNode<Integer>(12);
        node.right.left = new TreeNode<Integer>(34);
        System.out.println("Max Width "+max_width(node));
    }
}
