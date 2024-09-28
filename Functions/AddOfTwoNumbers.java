package Functions;
import java.util.*;
public class AddOfTwoNumbers {
    public static void Addition(int a1,int a2)
    {
        int add = a1+a2;
        System.out.println("The addition of two numbers "+a1+" & "+a2+" is "+add);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the two numbers:-");
        a = sc.nextInt();
        b = sc.nextInt();
        Addition(a,b);
    }
}
