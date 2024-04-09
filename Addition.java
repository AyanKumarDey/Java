//Here is the addition of two numbers and the numbers ar taken from the user.
import java.util.*;
public class Addition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:-");
        int a = sc.nextInt();
        System.out.println("Enter the second number:-");
        int b = sc.nextInt();
        int add = (a+b);
        System.out.println("The addition of two numbers is = "+add);
    }
}
