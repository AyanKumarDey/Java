package Functions;
import java.util.*;
public class Multiply {
    public static int multiply(int a1,int b1)
    {
        int mul = a1*b1;
        return mul;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:-");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int result = multiply(a,b);
        System.out.println("The multiplication of two numbers "+a+" & "+b+" is "+result);
    }
}
