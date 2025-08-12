import java.util.*;
class Node
{
    int data;
    Node right;
    Node left;
    Node(int num)
    {
        data = num;
    }
}
class BST
{
    Node root = null;
    void create(int num)
    {
        Node newnode = new Node(num);
        if(root == null)
            root = newnode;
        else
        {
            Node tptr = null;
            Node prev = null;
            for(tptr = root ; tptr != null ; prev = tptr , tptr = (tptr.data < num) ? tptr.right: tptr.left);
            if(prev.data > num)
                prev.left = newnode;
            else
                prev.right = newnode;
        }
    }
    void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    void display()
    {
        inorder(root);
    }
//    Node helper(Node root,int num1,int num2)
//    {
//        while(true)
//        {
//            if(root.data > num1 && root.data > num2)
//                root = root.left;
//            else if(root.data < num1 && root.data < num2)
//                root = root.right;
//            else
//                return root;
//        }
//    }
    Node helper(Node root,int num1,int num2)
    {
        if(root == null)
            return null;
        if(root.data == num1 || root.data == num2)
            return root;
        Node left = helper(root.left,num1,num2);
        Node right = helper(root.right,num1,num2);
        if(left != null && right != null)
            return root;
        return (left != null) ? left : right;
    }
    int leastCommonAncestor1(int num1,int num2)
    {
        return  helper(root,num1,num2).data;
    }
}
public class leastCommon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BST tree = new BST();
        while(true)
        {
            int num = input.nextInt();
            if(num == -1) break;
            tree.create(num);
        }
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(tree.leastCommonAncestor1(num1,num2));
        input.close();
    }
}
