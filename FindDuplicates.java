/*
Since the values are from 1 to n, we can use nums[i] - 1 as an index.
If the value at that index is already negative, it means we’ve seen that number before → it's a duplicate.
Otherwise, we mark it by making the value at that index negative*/

import java.util.*;

public class FindDuplicates {
    public static void findDuplicates(int[] nums) {
        System.out.print("Duplicates: ");
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (val < 0) val = -val;
            int index = val - 1;

            if (nums[index] < 0) {
                int dup = nums[i];
                if (dup < 0) dup = -dup;
                System.out.print(dup + " ");
            } else {
                nums[index] = -nums[index];
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " positive integers (1 to " + n + "):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        findDuplicates(nums);
    }
}
