//Created table using while loop.
package Loops;
import java.util.*;
public class LoopProg1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which the table will be generated:-");
        int n = sc.nextInt();
        int n1 = 0;
        System.out.println("The table of "+n+" is:-");
        while(n1<=10)
        {
           System.out.println(n+" X "+n1+" = "+(n*n1));
           n1++;
        }
    }
}
