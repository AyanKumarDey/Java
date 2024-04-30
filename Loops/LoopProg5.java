//Factorial of a number.
package Loops;
import java.util.*;
public class LoopProg5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which the factorial will be created:-");
        int num = sc.nextInt();
        int sum = 1;
        for(int i=1;i<=num;i++)
        {
            sum *= i;
        }
        System.out.println("The Factorial of "+num+" is = "+sum);
    }
}
