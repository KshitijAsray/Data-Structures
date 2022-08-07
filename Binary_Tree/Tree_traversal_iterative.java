package Binary_Tree;
import java.util.Stack;
public class Tree_traversal_iterative 
{
    void Inorder(TreeNode<Integer> root)
    {
        Stack<TreeNode<Integer>> st = new Stack<>();
        TreeNode<Integer> cur = root;
        while(cur!=null||st.isEmpty()==false)
        {
            while(cur!=null)
            {
                st.push(cur);
                cur = cur.left;
            }
            cur = st.pop();
            System.out.print(cur.key+" ");
            cur = cur.right;
        }
        System.out.println();
    }
    void Preorder(TreeNode<Integer> root)
    {
        if(root==null)
            return;
        Stack<TreeNode<Integer>> st = new Stack<>();
        st.push(root);
        while(st.isEmpty()==false)
        {
            TreeNode<Integer> curNode = st.pop();
            System.out.print(curNode.key+" ");
            if(curNode.right!=null)
                st.push(curNode.right);
            if(curNode.left!=null)
                st.push(curNode.left);
        }
        System.out.println();
    }
    void Preorder_space_optimized(TreeNode<Integer> root)
    {
        if(root==null)
            return;
        Stack<TreeNode<Integer>> st = new Stack<>();
        st.push(root);
        TreeNode<Integer> curNode = root;
        while(st.isEmpty()==false)
        {
            while(curNode!=null)
            {
                System.out.print(curNode.key+" ");
                if(curNode.right!=null)
                    st.push(curNode.right);
                curNode = curNode.left;
            }
            curNode = st.pop();
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Tree_traversal_iterative it = new Tree_traversal_iterative();
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
        System.out.println("Inorder Traversal");
        it.Inorder(node);
        System.out.println("Preorder Traversal");
        it.Preorder(node);
        System.out.println("Preorder Traversal Space Optimized");
        it.Preorder_space_optimized(node);
    }
}
