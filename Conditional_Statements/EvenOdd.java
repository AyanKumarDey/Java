package Conditional_Statements;
import java.util.*;
public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number:-");
        a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The given number is Even");
        }
        else
        {
            System.out.println("The given number is Odd");
        }
    }
}
