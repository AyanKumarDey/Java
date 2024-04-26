package Arithematic_Operators;

import java.util.*;
public class Cuboid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float length,breadth,height;
        System.out.println("Enter the length of the triangle:-");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of the triangle:-");
        breadth = sc.nextFloat();
        System.out.println("Enter the height of the triangle:-");
        height = sc.nextFloat();
        double volume;
        volume = length*breadth*height;
        double TotalArea;
        TotalArea = 2*((length*breadth)+(height*length)+(height*breadth));
        System.out.println("The volume of the cuboid is = "+volume);
        System.out.println("The total area of the cuboid is = "+TotalArea);
    }
}
