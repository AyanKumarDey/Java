package Functions;
import java.util.*;
public class Fibonacci {
    public static void fibonacci(int n1)
    {
        int a=0,b=1;
        int c;
        System.out.print(a+" "+b);
        for(int i=0;i<n1;i++)
        {
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the fibonacci series:-");
        int  n = sc.nextInt();
        fibonacci(n);
    }
}
