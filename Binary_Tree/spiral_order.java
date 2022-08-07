package Binary_Tree;
import java.util.*;
public class spiral_order 
{   
    void spiral_1(TreeNode<Integer> root)
    {
        if(root==null)
            return;
        Queue<TreeNode<Integer>> q1 = new LinkedList<>();
        Stack<Integer> s1 = new Stack<>();
        q1.add(root);
        boolean rev = false;
        while(q1.isEmpty()==false)
        {
            int count = q1.size();
            for(int i = 0;i<count;i++)
            {
                TreeNode<Integer> cur = q1.remove();
                if(rev==false)
                    System.out.print(cur.key+" ");
                else
                    s1.add(cur.key);
                if(cur.left!=null)
                    q1.add(cur.left);
                if(cur.right!=null)
                    q1.add(cur.right);
            }
            if(rev==true)
            {
                while(s1.isEmpty()==false)
                {
                    System.out.print(s1.pop()+" ");
                }
            }
            rev = !rev;
            System.out.println();
        }
    }
    public void spiral_2(TreeNode<Integer> root)
    {
        int height = Binary_Tree.Tree_properties.Height(root);
        for(int i = 0;i<height;i++)
        {
            if(i%2==0)
            {
                printk(root, i);
            }
            else
                {
                    printk_stack(root, i);
                    while(s11.empty()==false)
                        System.out.print(s11.pop()+" ");

                }
            System.out.println();
        }

    }
    void printk(TreeNode<Integer> root,int k)
    {
        if(root==null)
            return;
        if(k==0)
            System.out.print(root.key+" ");
        else
            {
                printk(root.left, k-1);
                printk(root.right, k-1);
            }
    }
    static Stack<Integer> s11 = new Stack<>();
    void printk_stack(TreeNode<Integer> root,int k)
    {
        if(root==null)
            return;
        if(k==0)
                s11.add(root.key);
        else
            {
                printk_stack(root.left, k-1);
                printk_stack(root.right, k-1);
            }
    }
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(10);
        spiral_order sp = new spiral_order();
        node.left = new TreeNode<Integer>(20);
        node.right = new TreeNode<Integer>(30);
        node.left.left = new TreeNode<Integer>(40);
        node.left.right = new TreeNode<Integer>(50);
        node.right.left = new TreeNode<Integer>(60);
        node.right.right = new TreeNode<Integer>(70);
        sp.spiral_1(node);
        sp.spiral_2(node);
        
    }
    
}
