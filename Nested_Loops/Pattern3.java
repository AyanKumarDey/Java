package Nested_Loops;
import java.util.*;
public class Pattern3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max row:-");
        int r = sc.nextInt();
        System.out.println("Enter the max column:-");
        int c = sc.nextInt();
        System.out.println("The following pattern is:-");
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print((i+j)+" ");
            }
            System.out.println("");
        }
    }
}
