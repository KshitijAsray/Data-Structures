package Binary_Tree;
public class Inorder_Preorder_to_BT 
{
    static int preIndex = 0;
    public static TreeNode<Integer> cTree(int in[],int pre[],int is,int ie){
        if(is>ie)return null;
        TreeNode<Integer> root=new TreeNode<>(pre[preIndex++]);
        
        int inIndex=is;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.key){
                inIndex=i;
                break;
            }
        }
        root.left=cTree(in, pre, is, inIndex-1);
        root.right=cTree(in, pre, inIndex+1, ie);
        return root;
    }
    static int indexOf(int arr[],int x)
    {
        int i;
        for(i = 0;i<arr.length;i++)
        {
            if(arr[i]==x)
                break;
        }
        return i;
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
    public static void main(String args[])
    {
        int in[] = {40,20,60,50,70,10,80,100,30};
        int pe[] = {10,20,40,50,60,70,30,80,100};
        TreeNode<Integer> node = cTree(in, pe,0,in.length-1);
        Preorder(node);
        System.out.println();
        Inorder(node);
    }
}
