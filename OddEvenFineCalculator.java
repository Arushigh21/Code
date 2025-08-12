/*
We have:
	An integer array a[] of size N that contains the last digit of vehicle registration numbers.
	An integer D representing the date
	An integer X which is the fine for each violation.
Odd-even rule:
	If D is even, only even last-digit vehicles are allowed.
	If D is odd, only odd last-digit vehicles are allowed.
Any vehicle that does not comply with this rule is fined X rupees.
We need to count such violations and calculate total fine.*/
import java.util.*;

public class OddEvenFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vehicles:");
        int N = sc.nextInt();  
		System.out.println("Enter the last digit of the vehicle registration number:");
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();  // last digit of registration number
        }
		System.out.println("Enter the date:");
        int D = sc.nextInt();  
		System.out.println("Enter the fine per violation:");
        int X = sc.nextInt();  

        int totalFine = 0;

        // Determine if the date is even or odd
        boolean isDateEven = (D % 2 == 0);

        for (int i = 0; i < N; i++) {
            boolean isVehicleEven = (a[i] % 2 == 0);
            if (isDateEven && !isVehicleEven || !isDateEven && isVehicleEven) {
                totalFine += X;
            }
        }

        System.out.println("The total fine is "+totalFine);
    }
}