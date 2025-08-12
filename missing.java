/* 13,14,15,16,17,19,20(sorted so 18 missing)
57,59,55,51,52,58,54,56(53 missing)*/

import java.util.*;
public class missing
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] arr = new int[N];
        for(int ind = 0 ; ind < N ; ind++)
        {
            arr[ind] = input.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int ind = 0 ; ind < N ; ind++)
        {
            sum+=arr[ind];
            min = Math.min(min,arr[ind]);
            max = Math.max(max,arr[ind]);
        }
		int a=(((((N*(N+1))/2) + (N+1)*min)) - sum);
        System.out.println("Missing number is:"+a);
        input.close();
    }
}

