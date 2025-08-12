/*logic
1.Loop from a to b.
2. For each number i, compute how many times it is divisible by 2.
3. Track the number with the highest exponent found so far.
4. If two numbers have the same exponent, choose the smaller number.*/

import java.util.*;
public class MaxExponentFinder {
    public static int MaxExponents(int a, int b) {
        int maxExponent = -1;
        int result = a;
        for (int i = a; i <= b; i++) {
            int exponent = 0;
            int x = i;
            while (x % 2 == 0) {
                exponent++;
                x /= 2;
            }
            if (exponent > maxExponent || (exponent == maxExponent && i < result)) {
                maxExponent = exponent;
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Number with highest power of 2 in its factorization: " + MaxExponents(a, b)); 
    }
}