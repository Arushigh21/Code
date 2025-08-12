/*max gold coin collector
4
1 7 3 10           1 8 11 21
2 1 4 01           3 9 
3 2 5 07           6
1 1 1 21           7
*/
import java.util.*;
public class maxPath
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] coins = new int[N][N];
        for(int row = 0 ; row < N ; row++)
        {
            for(int  col = 0 ; col < N ; col++)
            {
                coins[row][col] = input.nextInt();
            }
        }
        int[][] res = new int[N][N];
        res[0][0] = coins[0][0];
        for(int ind = 1 ; ind < N ; ind++)
        {
            res[0][ind] = coins[0][ind] + res[0][ind-1];
        }
        for(int ind = 1 ; ind < N ; ind++)
        {
            res[ind][0] = coins[ind][0] + res[ind-1][0];
        }
        for(int row = 1 ; row < N ; row++)
        {
            for(int  col = 1 ; col < N ; col++)
            {
                res[row][col] = Math.max(res[row][col-1] , res[row-1][col]) + coins[row][col];
            }
        }
        System.out.print(res[N-1][N-1]);
        // for(int row = 0 ; row < N ; row++)
        // {
        //     for(int  col = 0 ; col < N ; col++)
        //     {
        //         System.out.print(res[row][col]+" ");
        //     }
        //     System.out.println();
        // }
        input.close();
    }
}



