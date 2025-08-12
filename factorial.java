/*display the factorial or the value 100-500,display the factorial
eac node one value in a linked list
-accept the number from the user(N)
-define a node class 
-create a node and store 1(initilisation)
-access all the values from the range(1-N)
-	access all nodes from a list
		pro=current node data * multiplier+carry
		current node data=unit digit of result
		carry=pro/10
	if carry =0
		for every digit in a carry create a node and connect to the result
*/
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int dig)
    {
        data = dig;
    }
}
public class factorial
{
    public static void display(Node res)
    {
        if(res != null)
        {
            display(res.next);
            System.out.print(res.data);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Node res = new Node(1);
        for(int mul = 1 ; mul <= N ; mul++)
        {
            Node tptr = res;
            int carry = 0;
            while(tptr != null)
            {
                int pro = tptr.data * mul + carry;
                carry =  pro / 10;
                tptr.data = pro % 10;
                tptr = tptr.next;
            }
            while(carry != 0)
            {
                int dig = carry % 10;
                Node newnode = new Node(dig);
                tptr = res;
                while(tptr.next != null)
                    tptr = tptr.next;
                tptr.next = newnode;
                carry /= 10;
            }
        }
        display(res);
        input.close();
    }
}
