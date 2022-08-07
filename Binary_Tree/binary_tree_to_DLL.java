package Binary_Tree;

public class binary_tree_to_DLL 
{
    static TreeNode<Integer> prev = null;
    static TreeNode<Integer> BTTODLL(TreeNode<Integer> root)
    {
        if(root==null)
            return root;
        TreeNode<Integer> head = BTTODLL(root.left);
        if(prev==null)
            head=root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTTODLL(root.right);
        return head;
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
        TreeNode<Integer> head = BTTODLL(node);
        while(head!=null)
        {
            System.out.print(head.key+" ");
            head = head.right;
        }
    }    
}
