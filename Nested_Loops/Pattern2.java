package Nested_Loops;
import java.util.*;
public class Pattern2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max rows:-");
        int r = sc.nextInt();
        System.out.println("Enter the max columns:-");
        int c = sc.nextInt();
        System.out.println("The pattern is:-");
        for(int i=1;i<=r;i++) //For Rows
        {
            for(int j=1;j<=c;j++) // For Columns
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
