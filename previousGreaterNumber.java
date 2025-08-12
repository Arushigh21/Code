/*previous greater number
input=81935476
greater=-1,8,-1,9,9,5,9,7
holiday list,faculty list*/
import java.util.*;
public class previousGreaterNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        for(int ind = 0 ; ind < N ; ind++)
        {
            arr[ind] = input.nextInt();
        }
        Stack<Integer> ref = new Stack<>();
        ref.add(arr[0]);
        System.out.print("-1 ");
        for(int ind = 1 ; ind < N ; ind++)
        {
            if(!ref.isEmpty() && arr[ind] < ref.peek())
            {1
                System.out.print(ref.peek()+" ");
                ref.add(arr[ind]);
            }
            else if(!ref.isEmpty() && arr[ind] > ref.peek())
            {
                ref.pop();
                ind--;
            }
            else
            {
                System.out.print("-1 ");
                ref.add(arr[ind]);
            }
        }
        input.close();
    }
}
