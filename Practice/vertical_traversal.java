package Practice;
import java.util.*;
public class vertical_traversal 
{
    static ArrayList <Integer> verticalOrder(TreeNode<Integer> root)
    {
        Queue<Pair> q1 = new ArrayDeque<>();
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q1.add(new Pair(root,0));
        while(!q1.isEmpty())
        {
            Pair temp = q1.remove();
            if(map.containsKey(temp.hd))
                map.get(temp.hd).add(temp.node.data);
            else
            {
                ArrayList<Integer> mp = new ArrayList<>();
                mp.add(temp.node.data);
                map.put(temp.hd,mp);
            }
            if(temp.node.left!=null)
                q1.add(new Pair(temp.node.left,temp.hd-1));
            if(temp.node.right!=null)
                q1.add(new Pair(temp.node.right,temp.hd+1));
        }
        for(Map.Entry<Integer,ArrayList<Integer>> yu : map.entrySet())
        {
            for(Integer i : yu.getValue())
                ans.add(i);
        }
        return ans;
    }
}
