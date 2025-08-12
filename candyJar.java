import java.util.*;
public class candyJar
{
	public static void main(String[] args) {
	     int N = 10; // Maximum capacity of the jar
         int K = 5; // Minimum candies that must be left before refilling
         int candiesInJar = N;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of candies to buy: ");
        int candiesRequested = scanner.nextInt();

        
        if (candiesRequested <= 0 || candiesRequested > candiesInJar) {
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF CANDIES LEFT : " + candiesInJar);
        }
        else {
            candiesInJar -= candiesRequested;
            System.out.println("NUMBER OF CANDIES SOLD : " + candiesRequested);
            System.out.println("NUMBER OF CANDIES LEFT : " + candiesInJar);

            
        if (candiesInJar <= K) {
                candiesInJar = N;
                System.out.println("JAR REFILLED");
                System.out.println("NUMBER OF CANDIES IN JAR NOW : " + candiesInJar);
            }
        }

        scanner.close();
	}
}