import java.util.*;

public class monkeyFood {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter total number of Monkeys (n): ");
int n = sc.nextInt();
System.out.print("Enter number of Bananas a Monkey can eat (k): ");
int k = sc.nextInt();
System.out.print("Enter number of Peanuts a Monkey can eat (j): ");
int j = sc.nextInt();
System.out.print("Enter total number of Bananas (m): ");
int m = sc.nextInt();

System.out.print("Enter total number of Peanuts (p): ");
int p = sc.nextInt();

int monkeysFed = 0;

while (monkeysFed < n) {
if (m >= k) {
m -= k;
 monkeysFed++;
} 
			else if (p >= j) {
 p -= j;
monkeysFed++;
} 
			else if (m > 0 || p > 0) {
 m = 0;
 p = 0;
monkeysFed++;
 break;
 } 
			else {
 break;
}
}

int monkeysLeft = n - monkeysFed;
System.out.println("Number of Monkeys left on the tree: " + monkeysLeft);
}
}
