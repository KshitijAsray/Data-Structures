package Binary_Search_Tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Queue;
public class Vertical_traversal
{
    public static TreeMap<Integer,ArrayList<Integer>> Vertical_Traversal(TreeNode<Integer> root)
    {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair_class> q1 = new LinkedList<>();
        q1.add(new Pair_class(root,0));
        while(q1.isEmpty()==false)
        {
            Pair_class p = q1.poll();
            int hd = p.hd;
            TreeNode<Integer> curNode = p.node;
            if(map.containsKey(hd))
                map.get(hd).add(curNode.key);
            else
            {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(curNode.key);
                map.put(hd, arr);
            }
            if(curNode.left!=null)
                q1.add(new Pair_class(curNode.left, hd-1));
            if(curNode.right!=null)
                q1.add(new Pair_class(curNode.right, hd+1));
        }
        return map;
    }
    public static void Map_traversal(TreeMap<Integer,ArrayList<Integer>> map)
    {
        for(Map.Entry<Integer,ArrayList<Integer>> e: map.entrySet())
            {
                ArrayList<Integer> arr = e.getValue();
                for(int i: arr)
                    System.out.print(i+" ");
                System.out.println();
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
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        map = Vertical_Traversal(node);
        Map_traversal(map);
        
    }
}