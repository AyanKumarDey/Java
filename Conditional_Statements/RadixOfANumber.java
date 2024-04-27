package Conditional_Statements;
import java.util.*;
public class RadixOfANumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in the string format:-");
        String num = sc.nextLine();
        if(num.matches("[01]+")) //[]+ for not accepting null string.
        {
            System.out.println("Binary Radix is 2");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("Octal Radix is 8");
        }
        else if(num.matches("[0-9]+"))
        {
            System.out.println("Decimal Radix is 10");
        }
        else if(num.matches("[0-9A-F]*"))
        {
            System.out.println("Hexadecimal Radix is 16");
        }
        else
        {
            System.out.println("Other String Value");
        }
    }
}
