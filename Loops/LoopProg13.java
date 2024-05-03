//Geometric Progression Series.
package Loops;
import java.util.*;
public class LoopProg13 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting symbol:-");
        int a = sc.nextInt();
        System.out.println("Enter the difference between the numbers:-");
        int d = sc.nextInt();
        System.out.println("Enter the multiple:-");
        int m = sc.nextInt();
        System.out.println("Enter the maximum limit of the series:-");
        int n = sc.nextInt();
        int sum = a;
        System.out.println("The GP series is:-");
        System.out.print(a);
        for(int i=1;i<n;i++)
        {
            sum += d;
            System.out.print(","+sum);
            d = d*m;
        }
    }
}
