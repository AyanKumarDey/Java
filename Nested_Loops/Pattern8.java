package Nested_Loops;
import java.util.*;
public class Pattern8 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max rows:-");
        int r = sc.nextInt();
        System.out.println("Enter the max column:-");
        int c = sc.nextInt();
        System.out.println("The following pattern is:-");
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(j<i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
}
