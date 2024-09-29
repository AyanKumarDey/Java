package Functions;
import java.util.*;
public class Factorial {
    public static long factorial(int n1)
    {
        long fact = 1;
        for(int i=1;i<=n1;i++)
        {
            fact*=i;
        }
        return fact;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which factorial will be generated:-");
        int n;
        n = sc.nextInt();
        long result = factorial(n);
        System.out.println("The factorial of "+n+" is "+result);
    }
}
