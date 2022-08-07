package Binary_Tree;

public class count_nodes_complete_tree 
{
    int count_node(TreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        else
            return (1+count_node(root.left)+count_node(root.right));
    }
    int count_nodes_efficient(TreeNode<Integer> root)
    {
        if(root==null)
            return 0;
        int lh = 0,rh = 0;
        TreeNode<Integer> curr = root;
        while(curr!=null)
        {
            lh++;
            curr = curr.left;
        }
        curr = root;
        while(curr!=null)
        {
            rh++;
            curr=root.right;
        }
        if(lh==rh)
            return (int)(Math.pow(2, lh)-1);
        return 1+count_nodes_efficient(root.left)+count_nodes_efficient(root.right);
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
        count_nodes_complete_tree ob = new count_nodes_complete_tree();
        System.out.println(ob.count_node(node));
        System.out.println(ob.count_node(node));
    }
}

