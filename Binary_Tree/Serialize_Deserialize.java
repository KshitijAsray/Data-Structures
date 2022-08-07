package Binary_Tree;
import java.util.*;
public class Serialize_Deserialize 
{
   static final int empty = -1;
   void Serialize(TreeNode<Integer> root, ArrayList<Integer> serial)
   {
       if(root==null)
        {
            serial.add(empty);
            return;
        }
        serial.add(root.key);
        Serialize(root.left, serial);
        Serialize(root.right, serial);
   }
   static int index = 0;
   TreeNode<Integer> Deserialize(ArrayList<Integer> deserialize)
   {
        if(index==deserialize.size())
            return null;
        int val = deserialize.get(index);
        index++;
        if(val==empty)
            return null; 
        TreeNode<Integer> root = new TreeNode<Integer>(val);
        root.left = Deserialize(deserialize);
        root.right= Deserialize(deserialize);
        return root;
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
    Binary_Tree.Inorder_Preorder_to_BT.Preorder(node);
    System.out.println();
    ArrayList<Integer> serial = new ArrayList<>();
    ArrayList<Integer> serial1 = new ArrayList<>();
    Serialize_Deserialize ob = new Serialize_Deserialize();
    ob.Serialize(node, serial);
    System.out.println(serial);
    TreeNode<Integer> ty = ob.Deserialize(serial);
    System.out.println();
    Binary_Tree.Inorder_Preorder_to_BT.Preorder(ty);
    System.out.println();
    ob.Serialize(ty, serial1);
    System.out.println(serial1);
   }
}
