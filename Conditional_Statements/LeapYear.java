package Conditional_Statements;
import java.util.*;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:-");
        int year = sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("The year is leap year");
                }
                else
                {
                    System.out.println("The year is not a leap year");
                }
            }
            else
            {
                System.out.println("The year is leap year");
            }
        }
        else
        {
            System.out.println("The year is not a leap year");
        }
    }
}
