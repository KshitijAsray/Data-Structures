package Binary_Search_Tree;
import java.util.*;
public class top_view 
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
            if(map.containsKey(hd)==false)
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
}
