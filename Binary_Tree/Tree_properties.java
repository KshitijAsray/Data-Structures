package Binary_Tree;
public class Tree_properties 
{
    public static int diameter_naive(TreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        int d1 = 1+Height(root.left)+Height(root.right);
        int d2 = diameter_naive(root.left);
        int d3 = diameter_naive(root.right);
        return(Math.max(d1, Math.max(d2, d3)));
    }
    static int res = 0;
    public static int diameter_efficient(TreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        int lh = diameter_efficient(root.left);
        int rh = diameter_efficient(root.right);
        res = Math.max(res, 1+lh+rh);
        return(1+Math.max(lh, rh));
    }
    public static int Height(TreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        else
            return (Math.max(Height(root.left),Height(root.right))+1);
    }
    public static int Size(TreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        else
            return (1+Size(root.left)+Size(root.right));
    }
    public static int min = 0;
    public static int max(TreeNode<Integer> root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        else
        {
            min = Math.max(root.key,Math.max(max(root.left),max(root.right)));
            return (Math.max(root.key,Math.max(max(root.left),max(root.right))));
        }
    }
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(10);
        node.left = new TreeNode<Integer>(20);
        node.right = new TreeNode<Integer>(30);
        node.right.right = new TreeNode<Integer>(50);
        node.right.left = new TreeNode<Integer>(40);
        System.out.println("Height of Tree");
        System.out.println(Height(node));
        System.out.println("Size of Tree");
        System.out.println(Size(node));
        System.out.println("MAX");
        System.out.println(max(node));
        diameter_efficient(node);
        System.out.println(res+" "+diameter_naive(node));
        System.out.println(min);
        System.err.println(max(node));
    }
}
