/*
-Initialize a pointer index = 0
(This pointer keeps track of where the next non-zero element should go)
-Traverse the array from left to right using a loop i from 0 to n - 1:
-If arr[i] is non-zero:
-Assign arr[index] = arr[i]
-Increment index by 1
-After the loop, all non-zero elements are at the beginning of the array.
-Now, from index to n - 1, set all values to 0
-End*/

import java.util.Arrays;
public class DeliveryDataCleaner {
    public static void main(String[] args) {
        int[] deliveries = {3, 0, 4, 0, 0, 1, 5};     
        moveZerosToEnd(deliveries);
        System.out.println(Arrays.toString(deliveries));
    }
    public static void moveZerosToEnd(int[] arr) {
        int index = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
