/*Logic
Create a pair of elements and their indices: [(value, original_index)]
Sort the array based on the values.
Use a visited array to mark visited elements.
For each unvisited element, trace the cycle it forms.
The number of swaps needed for a cycle of size k is k - 1.
Add all such swaps from all cycles.*/

import java.util.*;
public class MinSwapsToSort {
    public static int minSwaps(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || pairs[i][1] == i)
                continue;
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = pairs[j][1]; 
                cycleSize++;
            }           
            if (cycleSize > 0) {
                swaps += (cycleSize - 1);
            }
        }
        return swaps;
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];       
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = minSwaps(arr);
        System.out.println("Minimum number of swaps required: " + result);
    }
}

