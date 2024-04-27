package Conditional_Statements;
import java.util.*;
public class Problem1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the age:-");
        age = sc.nextInt();
        if(age>=14 && age<=55)
        {
            System.out.println("The person is young");
        }
        else
        {
            System.out.println("The person is not young");
        }
    }
}
