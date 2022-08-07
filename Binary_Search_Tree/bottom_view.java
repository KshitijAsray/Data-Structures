package Binary_Search_Tree;
import java.util.*;
public class bottom_view 
{
    public static void Bottom_view(TreeNode<Integer> root, TreeMap<Integer,Integer> map)
    {
        Queue<Pair_class> q1 = new LinkedList<>();
        //TreeMap<Integer,Integer> map = new TreeMap<>();
        q1.add(new Pair_class(root,0));
        while(q1.isEmpty()==false)
        {
            Pair_class p = q1.poll();
            int hd = p.hd;
            TreeNode<Integer> curNode = p.node;
            map.put(hd, curNode.key);
            if(curNode.left!=null)
                q1.add(new Pair_class(curNode.left, hd-1));
            if(curNode.right!=null)
                q1.add(new Pair_class(curNode.right, hd+1));
        }
    }
    public static void Map_traversal(TreeMap<Integer,Integer> map)
    {
        for(Map.Entry<Integer,Integer> e: map.entrySet())
            {
                System.out.print(e.getValue()+" ");
            }
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
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Map_traversal(map);
        Bottom_view(node, map);
        Map_traversal(map);
    }
}
