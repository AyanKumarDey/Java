//To find the total number of digits in the number.
package Loops;
import java.util.*;
public class LoopProg7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        int r;
        int count = 0;
        while(num>0)
        {
            r = num%10;
            num = num/10;
            count++;
        }
        System.out.println("The total of digits in the numbers is = "+count);
    }
}
