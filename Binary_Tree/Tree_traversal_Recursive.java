package Binary_Tree;
public class Tree_traversal_Recursive 
{
    void Inorder(TreeNode<Integer> root)
    {
        if(root!=null)
        {
            Inorder(root.left);
            System.out.print(root.key+" ");
            Inorder(root.right);
        }
    }
    void Preorder(TreeNode<Integer> root)
    {
        if(root!=null)
        {
            System.out.print(root.key+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    void Postorder(TreeNode<Integer> root)
    {
        if(root!=null)
        {
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(10);
        Tree_traversal_Recursive n = new Tree_traversal_Recursive();
        node.left = new TreeNode<Integer>(20);
        node.right = new TreeNode<Integer>(30);
        node.right.right = new TreeNode<Integer>(70);
        node.right.left = new TreeNode<Integer>(60);
        node.right.right.left = new TreeNode<Integer>(80);
        node.right.right.left.right = new TreeNode<Integer>(90);
        node.left.left = new TreeNode<Integer>(50);
        node.left.right = new TreeNode<Integer>(40);
        node.left.left.left = new TreeNode<Integer>(100);
        System.out.println("Inorder Traversal");
        n.Inorder(node);
        System.out.println();
        System.out.println("Preorder Traversal");
        n.Preorder(node);
        System.out.println();
        System.out.println("Postorder Traversal");
        n.Postorder(node);
    }
}
