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
class BT
{
    Node root = null;
    ArrayList<Node> ref = new ArrayList<>();
    int front = 0;
    int flag = 0;
    void create(int num)
    {
        Node newnode = new Node(num);
        if(root == null)
        {
            root = newnode;
            ref.add(newnode);
        }
        else
        {
            while(ref.get(front) == null)
            {
                front++;
            }
            if(flag != 1 && ref.get(front).left == null)
            {
                if(num != -1)
                {
                    ref.get(front).left = newnode;
                    ref.add(newnode);
                }
                else
                {
                    ref.add(null);
                }
                flag = 1;
            }
            else if(flag == 1 && ref.get(front).right == null)
            {
                if(num != -1)
                {
                    ref.get(front).right = newnode;
                    ref.add(newnode);
                }
                else
                {
                    ref.add(null);
                }
                flag = 0;
                front++;
            }
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
    int helper(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1)
        {
            return -1;
        }
        return Math.max(left,right) + 1;
    }
    int isBalanced()
    {
        return helper(root) == -1 ? 0 : 1;
    }
}
public class bstBalance
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BT tree = new BT();
        int N = input.nextInt();
        for(int itr = 1 ; itr <= N ; itr++)
        {
            int num = input.nextInt();
            tree.create(num);
        }
        tree.display();
        System.out.println(tree.isBalanced() == 1 ? " Balanced ": " Not ");
        input.close();
    }
}
