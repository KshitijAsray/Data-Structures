package Binary_Tree;
import java.util.LinkedList;
import java.util.Queue;
public class level_traversal 
{
    void level_traversal_1(TreeNode<Integer> root)
    {
        Queue<TreeNode<Integer>> q1 = new LinkedList<TreeNode<Integer>>();
        if(root==null)
            return;
        q1.add(root);
        while(q1.isEmpty()==false)
        {
            TreeNode<Integer> curTreeNode = q1.remove();
            System.out.print(curTreeNode.key+" ");
            if(curTreeNode.left!=null)
                q1.add(curTreeNode.left);
            if(curTreeNode.right!=null)
                q1.add(curTreeNode.right);
        }
    }
    void level_traversal_2(TreeNode<Integer> root)
    {
        int height = Binary_Tree.Tree_properties.Height(root);
        for(int i = 0;i<=height;i++)
        {
            Binary_Tree.print_nodes_k_distance.printk(root, i);
        }
    }
    void level_traversal_3(TreeNode<Integer> root)
    {
        if(root==null)  return;
        Queue<TreeNode<Integer>> q1 = new LinkedList<>();
        q1.add(root);
        q1.add(null);
        while(q1.size()>1)
        {
            TreeNode<Integer> curTreeNode = q1.remove();
            if(curTreeNode==null)
            {
                System.out.println();
                q1.add(null);
                continue;
            }
            System.out.print(curTreeNode.key+" ");
            if(curTreeNode.left!=null)
                q1.add(curTreeNode.left);
            if(curTreeNode.right!=null)
                q1.add(curTreeNode.right);
        }
        
    }
    void level_traversal_4(TreeNode<Integer> root)
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
                System.out.print(curTreeNode.key+" ");
                if(curTreeNode.left!=null)
                    q1.add(curTreeNode.left);
                if(curTreeNode.right!=null)
                    q1.add(curTreeNode.right);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(10);
        level_traversal l = new level_traversal();
        node.left = new TreeNode<Integer>(15);
        node.left.left = new TreeNode<Integer>(30);
        node.right = new TreeNode<Integer>(20);
        node.right.left = new TreeNode<Integer>(40);
        node.right.right = new TreeNode<Integer>(50);
        node.right.left.left = new TreeNode<Integer>(60);
        node.right.left.right = new TreeNode<Integer>(70);
        System.out.println("Size of Tree");
        System.out.println(Binary_Tree.Tree_properties.Size(node));
        System.out.println("Height of Tree");
        System.out.println(Binary_Tree.Tree_properties.Height(node));
        System.out.println("First Method");
        l.level_traversal_1(node);
        System.out.println();
        System.out.println("Second Method");
        l.level_traversal_2(node);
        System.out.println();
        System.out.println("Third Method");
        l.level_traversal_3(node);
        System.out.println();
        System.out.println("Fourth Method");
        l.level_traversal_4(node);
        
    }    
}
