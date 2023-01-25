package Practice;

public class TreeNode<T> 
{
    T data;
    TreeNode<T> next;
    TreeNode<T> left;
    TreeNode<T> right;
    TreeNode(T data)
    {
        this.data = data;
        next = null;
        left = null;
        right = null;
    }
}
