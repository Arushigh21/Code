/*logic
1.Initialize carry and count to 0.
2. Loop while there are digits left in num1 or num2 or there is a carry.
3. Add the last digits of both numbers and the carry.
4. If the sum is 10 or more, increment the carry counter and set carry to 1.
5. Otherwise, reset carry to 0.
6. Move to the next digit by integer division by 10.*/
import java.util.*;

public class CarryCounter {
    public static int NumberOfCarries(int num1, int num2) {
        int carry = 0, count = 0;
        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int sum = digit1 + digit2 + carry;
            if (sum >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }
            num1 /= 10;
            num2 /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
        System.out.println("The number of carries are "+NumberOfCarries(a,b)); 
    }
}
