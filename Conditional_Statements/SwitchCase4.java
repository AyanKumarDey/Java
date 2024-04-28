package Conditional_Statements;
import java.util.*;
public class SwitchCase4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:-");
        int a = sc.nextInt();
        System.out.println("Enter the second number:-");
        int b = sc.nextInt();
        sc.nextLine(); //When we take int type input from the keyboard before taking string input then the nextInt() method
        // remains into the keyboard buffer and skips to the nextLine() method without
        // taking the input so to avoid it we ar adding a extra nextLine() method before the string input.
        System.out.println("Enter the option of the operation to be done:-");
        String menu = sc.nextLine();
        menu = menu.toUpperCase(); //To make it UserFriendly so that if a user gives lowercase then there is no problem.
        switch(menu)
        {
            case "ADD" :
                int add = a+b;
                System.out.println("The addition of two numbers is = "+add);
                break;
            case "SUB" :
                int sub = a-b;
                System.out.println("The subtraction of two numbers is = "+sub);
                break;
            case "MUL" :
                int mul = a*b;
                System.out.println("The multiplication of two numbers is = "+mul);
                break;
            case "DIV" :
                int div = a/b;
                System.out.println("The division of two numbers is = "+div);
                break;
            default :
                System.out.println("Invalid");
                break;
        }
    }
}
