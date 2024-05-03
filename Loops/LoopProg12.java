//Arithmetic Progression Series.
package Loops;
import java.util.*;
public class LoopProg12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number fo the series:-");
        int a = sc.nextInt();
        System.out.println("Enter the limit of the series:-");
        int n = sc.nextInt();
        System.out.println("Enter the difference between the numbers:-");
        int d = sc.nextInt();
        int sum = a;
        System.out.println("The AP series is :- ");
        System.out.print(a);
        for(int i=1;i<n;i++)
        {
            sum += d;
            System.out.print(","+sum);
        }
    }
}
