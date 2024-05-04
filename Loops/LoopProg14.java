//Fibonacci Series.
package Loops;
import java.util.*;
public class LoopProg14 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the series:-");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.println("The fibonacci Series is:-");
        System.out.print(a+","+b);
        for(int i=0;i<n;i++)
        {
            c = a+b;
            System.out.print(","+c);
            a = b;
            b = c;
        }
    }
}
