package Binary_Tree;

public class print_nodes_k_distance 
{
    static void printk(TreeNode<Integer> root,int k)
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
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(10);
        node.left = new TreeNode<Integer>(20);
        node.right = new TreeNode<Integer>(30);
        node.right.right = new TreeNode<Integer>(50);
        node.right.left = new TreeNode<Integer>(40);
        printk(node,2);
    }    
}
