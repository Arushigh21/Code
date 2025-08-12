/*logic
Outer loop chooses the start of the subarray.
Inner loop extends the subarray and keeps adding to the sum.
If the sum equals k, we increment the count.*/

import java.util.*;
public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target sum k: ");
        int k = sc.nextInt();
        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum = " + k + " is: " + result);
    }
}
