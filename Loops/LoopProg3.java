package Loops;
import java.util.*;
public class LoopProg3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which the table is generated:-");
        int num = sc.nextInt();
        System.out.println("The table of "+num+" is:-");
        for(int i=0;i<=10;i++)
        {
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}
