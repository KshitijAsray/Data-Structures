package Binary_Search_Tree;
public class Kth_Smallest_element 
{
    public static TreeNode_mod<Integer> insert(TreeNode_mod<Integer> root, int key)
    {
        if(root==null)
        {
            TreeNode_mod<Integer> new_root = new TreeNode_mod<Integer>(key);
            return new_root;
        }
        if(root.data>key)
        {
            root.left = insert(root.left, key);
            root.lcount++;
        }
        else
            root.right = insert(root.right, key);
        return root;
    }
    public static TreeNode_mod<Integer> kthSmallest(TreeNode_mod<Integer> root, int k)
    {
        if (root == null)
            return null;
     
        int count = root.lcount + 1;
        if (count == k)
            return root;
     
        if (count > k)
            return kthSmallest(root.left, k);
     
        return kthSmallest(root.right, k - count);
    }
    public static void main(String args[])
    {
        TreeNode_mod<Integer> root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
     
        for (int x : keys)
            root = insert(root, x);
     
        int k = 4;
        TreeNode_mod<Integer> res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less "
                           + "than k nodes in the BST");
        else
            System.out.println("K-th Smallest"
                    + " Element is " + res.data);
    }
}
