package Binary_Search_Tree;
import java.util.HashSet;
public class pair_sum_BST 
{
    public static boolean find_pair_sum_BST(TreeNode<Integer> root, int sum, HashSet<Integer> h1)
    {
        if(root==null)
            return false;
        if(find_pair_sum_BST(root.left, sum, h1)==true)
            return true;
        if(h1.contains(sum-root.key))
            return true;
        else
            h1.add(root.key);
        return find_pair_sum_BST(root.right, sum, h1);
    }
    public static void main(String args[])
    {
        TreeNode<Integer> node = new TreeNode<Integer>(10);
        node.left = new TreeNode<Integer>(20);
        node.right = new TreeNode<Integer>(30);
        node.right.right = new TreeNode<Integer>(70);
        node.right.left = new TreeNode<Integer>(60);
        node.right.right.left = new TreeNode<Integer>(80);
        node.right.right.left.right = new TreeNode<Integer>(90);
        node.left.left = new TreeNode<Integer>(50);
        node.left.right = new TreeNode<Integer>(40);
        node.left.left.left = new TreeNode<Integer>(100);
        int sum = 200;
        HashSet<Integer> h1 = new HashSet<>();
        boolean h2 = find_pair_sum_BST(node, sum, h1);
        System.out.println(h2);
    }
}
