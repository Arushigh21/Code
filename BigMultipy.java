import java.util.*;
import java.math.BigInteger;
public class BigMultipy
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        BigInteger res = BigInteger.ONE;
        for(int val = 1 ; val <= N ; val++)
        {
            res = res.multiply(BigInteger.valueOf(val));
            System.out.println(res);
            System.out.println();
        }
        input.close();
    }
}
