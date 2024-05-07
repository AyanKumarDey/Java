package Nested_Loops;
import java.util.*;
public class Pattern10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max rows:-");
        int r = sc.nextInt();
        System.out.println("Enter the max columns:-");
        int c = sc.nextInt();
        System.out.println("The following pattern is:-");
        for(int i=1;i<r;i++) //First Half.
        {
            for(int j=1;j<=c;j++)
            {
                if(j<=c-i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            for(int k=1;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i1=1;i1<=r;i1++) //Second Half.
        {
            for(int j1=1;j1<=c;j1++)
            {
                if(j1<i1)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            for(int k1=1;k1<=c-i1;k1++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
