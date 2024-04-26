package Arithematic_Operators;

import java.util.*;
public class Quadratic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three values of a quadratic equation:-");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double r1,r2;
        r1 = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        r2 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("The roots of the quadratic equation is = "+r1+" "+r2);
    }
}
