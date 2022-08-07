package Binary_Tree;

public class balanced_tree 
{
    boolean isbalanced_naive(TreeNode<Integer> root)
    {
        if(root==null)
            return true;
        int lh = Binary_Tree.Tree_properties.Height(root.left);
        int rh = Binary_Tree.Tree_properties.Height(root.right);
        boolean decision = (Math.abs(lh-rh)<1&&isbalanced_naive(root.left)&&isbalanced_naive(root.right));
        return decision;
    }
    int isbalanced_efficient(TreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        int lh = isbalanced_efficient(root.left);
        if(lh==-1)
            return -1;
        int rh = isbalanced_efficient(root.right);
        if(rh==-1)
            return -1;
        if(Math.abs(lh-rh)>1)
            return -1;
        else
            return (Math.max(lh, rh)+1);
    }
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(20);
        balanced_tree bt = new balanced_tree();
        node.left = new TreeNode<Integer>(8);
        node.left.left = new TreeNode<Integer>(3);
        node.left.right = new TreeNode<Integer>(5);
        node.right = new TreeNode<Integer>(12);
        if(bt.isbalanced_naive(node)==true)
            System.out.println("Balnced Tree");
        else
            System.out.println("Not Balanced");
        if(bt.isbalanced_efficient(node)==-1)
            System.out.println("Balnced Tree");
        else
            System.out.println("Not Balanced");
    }
}
