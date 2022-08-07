package Binary_Tree;

public class children_sum 
{
    static boolean child_sum(TreeNode<Integer> root)
    {
         if(root.left==null&&root.right==null)
             return true;
        // if(root==null)
        //     return true;
        int sum = 0;
        if(root.left!=null) sum = sum+root.left.key;
        if(root.right!=null) sum = sum+root.right.key;
        return (root.key==sum && child_sum(root.left) && child_sum(root.right));

    }
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(20);
        node.left = new TreeNode<Integer>(8);
        node.left.left = new TreeNode<Integer>(3);
        node.left.right = new TreeNode<Integer>(5);
        node.right = new TreeNode<Integer>(12);
        System.out.println(child_sum(node));
    }

    //void dumpy_sum()   
}
