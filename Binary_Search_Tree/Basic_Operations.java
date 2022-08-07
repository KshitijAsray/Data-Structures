package Binary_Search_Tree;
public class Basic_Operations 
{
    public static boolean SearchNode_Recursive(TreeNode<Integer> node,int key)
    {
        if(node==null)
            return false;
        else if(key==node.key)
            return true;
        else if(key<node.key)
            SearchNode_Recursive(node.left, key);
        else
            SearchNode_Recursive(node.right, key);
        return false;
    }
    public static boolean SearchNode_Iterative(TreeNode<Integer> node, int key)
    {
        TreeNode<Integer> curNode = node;
        while(node!=null)
        {
            if(curNode.key==key)
                return true;
            if(key>curNode.key)
                curNode = curNode.right;
            else
                curNode = curNode.left;
        }
        return false;
    }
    public TreeNode<Integer> InsertNode_Recusive(TreeNode<Integer> node , int key)
    {
        if(node==null)
        {
            TreeNode<Integer> New_root = new TreeNode<Integer>(key);
            return New_root;
        }
        if(node.key==key)
            {
                System.out.println("Key already Present");
                return null;
            }
        if(key>node.key)
            node.right = InsertNode_Recusive(node.right, key);
        else
            node.left = InsertNode_Recusive(node.left, key);
        return node;
    }
    public TreeNode<Integer> InsertNode_Iterative(TreeNode<Integer> node,int key)
    {
        TreeNode<Integer> New_root = new TreeNode<Integer>(key);
        TreeNode<Integer> curNode = node,Parent = null;
        while(curNode!=null)
        {
            Parent = curNode;
            if(curNode.key==key)
                {
                    System.out.println("Key already Present");
                    return null;
                }
            if(key>curNode.key)
                curNode = curNode.right;
            else
                curNode = curNode.left;
        }
        if(Parent==null)
            return New_root;
        if(Parent.key>key)
            Parent.left = New_root;
        else
            Parent.right = New_root;
        return node;
    }
    public static TreeNode<Integer> DeleteTreeNode(TreeNode<Integer> root, int key_deleted)
    {
        if(root==null)
            return null;
        else if(root.key>key_deleted)
            root.left = DeleteTreeNode(root.left, key_deleted);
        else if(root.key<key_deleted)
            root.right = DeleteTreeNode(root.right, key_deleted);
        else if(root.key==key_deleted)
        {
            if(root.right==null)
                return root.left;
            else if(root.left==null)
                return root.right;
            else
            {
                TreeNode<Integer> successorNode = get_Successor_Node(root);
                root.key = successorNode.key;
                root.right = DeleteTreeNode(root.right, root.key);
            }
        }
        else
        {
            System.out.println("Key Not Found");
            return null;
        }
        return root;
    }
    public static TreeNode<Integer> get_Successor_Node(TreeNode<Integer> root)
    {
        TreeNode<Integer> tempNode = root;
        tempNode = tempNode.right;
        while(tempNode.left!=null)
            tempNode = tempNode.left;
        return tempNode;
    }
    static void Inorder(TreeNode<Integer> root)
    {
        if(root!=null)
        {
            Inorder(root.left);
            System.out.print(root.key+" ");
            Inorder(root.right);
        }
    }
    static void Preorder(TreeNode<Integer> root)
    {
        if(root!=null)
        {
            System.out.print(root.key+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    static void Postorder(TreeNode<Integer> root)
    {
        if(root!=null)
        {
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static TreeNode<Integer> floor(TreeNode<Integer> root, int x)
    {
        if(root==null)
            return null;
        TreeNode<Integer> res = root,curNode =root;
        while(curNode!=null)
        {
            if(curNode.key==x)
                return curNode;
            else if(x<curNode.key)
                curNode = curNode.left;
            else
            {
                res = curNode;
                curNode = curNode.right;
            }
        }
        return res;
    }
    public static TreeNode<Integer> ceil(TreeNode<Integer> root, int x)
    {
        if(root==null)
            return null;
            TreeNode<Integer> res = root,curNode =root;
            while(curNode!=null)
            {
                if(curNode.key==x)
                    return curNode;
                else if(x>curNode.key)
                    curNode = curNode.right;
                else
                {
                    res = curNode;
                    curNode = curNode.right;
                }
            }
            return res;
    }
    public static void main(String args[])
    {
        Basic_Operations bt = new Basic_Operations();
        TreeNode<Integer> node = bt.InsertNode_Iterative(null,50);
        bt.InsertNode_Iterative(node,30);
        bt.InsertNode_Iterative(node,20);
        bt.InsertNode_Iterative(node,40);
        bt.InsertNode_Iterative(node,70);
        bt.InsertNode_Iterative(node,60);
        bt.InsertNode_Iterative(node,80);
        bt.InsertNode_Iterative(node, 80);
        Inorder(node);
        System.out.println();
        Postorder(node);
        System.out.println();
        Preorder(node);
        System.out.println(floor(node,71).key);
        System.out.println(ceil(node,71).key);
    }
}
