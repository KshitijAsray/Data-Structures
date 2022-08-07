package Binary_Search_Tree;

public class TreeNode_mod<T>
{
    TreeNode_mod<T> left;
    TreeNode_mod<T> right;
    T data;
    int lcount;
    TreeNode_mod(T key)
    {
        data = key;
        left = null;
        right = null;
        lcount = 0;
    }
}
