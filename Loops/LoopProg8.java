//Armstrong Number.
package Loops;
import java.util.*;
public class LoopProg8 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num = sc.nextInt();
        int r,sum=0,count=0;
        int num1=num;//For the use for finding Armstrong Number
        int num2=num;//For Checking the Number is Armstrong or not.
        while(num>0)//Finding the total number of digits present in the number.
        {
            num = num/10;
            count++;
        }
        System.out.println("The total number of digits present in the number is = "+count);
        while(num1!=0)//Checking the main condition for Armstrong Number.
        {
            r = num1%10;
            num1 = num1/10;
            sum += Math.pow(r,count);
        }
        System.out.println("The total sum is = "+sum);
        if(sum==num2)
        {
            System.out.println("The number is Armstrong");
        }
        else
        {
            System.out.println("The number is not a Armstrong Number");
        }
    }
}
