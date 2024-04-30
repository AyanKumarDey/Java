//Print the digit's of a number from right to left.
package Loops;
import java.util.*;
public class LoopProg6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        int r;
        while(num!=0)
        {
            r = num%10;
            num = num/10;
            System.out.println("The digits of the numbers are "+r);
        }
    }
}
