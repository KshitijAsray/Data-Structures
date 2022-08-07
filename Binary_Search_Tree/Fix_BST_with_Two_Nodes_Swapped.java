package Binary_Search_Tree;
public class Fix_BST_with_Two_Nodes_Swapped 
{
    static TreeNode<Integer> pre = null;
    static TreeNode<Integer> First = null;
    static TreeNode<Integer> Second = null;
    public static void fix_BST(TreeNode<Integer> root)
    {
        if(root==null)
            return;
        fix_BST(root.left);
        if(pre!=null&&root.key<pre.key)
        {
            if(First==null)
                First = pre;
            Second = root;
        }
        pre = root;
        fix_BST(root.right);
    }
    public static TreeNode<Integer> fix_Bst_driver(TreeNode<Integer> root)
    {
        Binary_Search_Tree.Basic_Operations.Inorder(root);
        fix_BST(root);
        int temp = First.key;
        First.key = Second.key;
        Second.key= temp;
        System.out.println();
        Binary_Search_Tree.Basic_Operations.Inorder(root);
        return null;
        
    }
    public static void main(String args[])
    {
        TreeNode<Integer> root = new TreeNode<>(18);  
        root.left = new TreeNode<>(60);  
        root.right = new TreeNode<>(70);  
        root.left.left = new TreeNode<>(4);  
        root.right.left = new TreeNode<>(8);
        root.right.right = new TreeNode<>(80);
        fix_Bst_driver(root);
    }
        
}
