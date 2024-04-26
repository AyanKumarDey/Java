package Arithematic_Operators;

import java.util.*;
public class AreaOfTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float base,height;
        System.out.println("Enter the height of the triangle:-");
        height = sc.nextFloat();
        System.out.println("Enter the base of the triangle:-");
        base = sc.nextFloat();
        float area;
        area = (0.5f)*base*height;
        System.out.println("The area of the triangle is = "+area);
    }
}
