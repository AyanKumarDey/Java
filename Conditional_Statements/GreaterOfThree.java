package Conditional_Statements;
import java.util.*;
public class GreaterOfThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three numbers:-");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("The greater number is = "+a);
        }
        else if(b>c)
        {
            System.out.println("The greater number is = "+b);
        }
        else
        {
            System.out.println("The greater number is = "+c);
        }
    }
}
