//Created table using do while loop.
package Loops;
import java.util.*;
public class LoopProg2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which the table is to be generated:-");
        int num = sc.nextInt();
        int n1 = 0;
        System.out.println("The table of "+num+" is:-");
        do{
            System.out.println(num+" X "+n1+" = "+(num*n1));
            n1++;
        }while(n1<=10);
    }
}
