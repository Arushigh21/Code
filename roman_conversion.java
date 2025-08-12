/*roman to number,roman to base conversion
40-XL,50-L,90-XC,100-C,400-CD,500-D,900-CM,1000-M
1234-MCCXXXIV(1000=M,200=100+100=CC,)
-accept an integer
-
*/
import java.util.*;
public class roman_conversion
{
    static String arr[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    static int num[]= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
    static String s="";
    public static String conversionto(int n)
    {
        for(int x=num.length -1; x>=0; x--)
        {
            if(n >=num[x])
            {
                s=s +arr[x];
                n-=num[x];
                x=num.length -1;
            }
        }
        return s;
    }
    public static void base_conversion()
    {
        char a[]= s.toCharArray();
        char b[]=s.toCharArray();
        Arrays.sort(a);
        int n=a.length;
        int base= 10+ ((int)a[n-1] - 64);  
        System.out.println(base);
        long ans=0;
        int n1=0;
        n=n-1;
        while(n>=0)
        {
            int x= (int)b[n] - 55;
            int y=(int) Math.pow(base, n1);
            ans+=(x*y);
            n--;
            n1++;
        }
        System.out.println(ans);
    }
    public static void main(String[] args)
    {
         Scanner sc= new Scanner(System.in);
         int x=sc.nextInt();
         String c= conversionto(x);
         System.out.println(c);
         base_conversion();   
     }
}
