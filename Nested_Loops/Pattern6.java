package Nested_Loops;
import java.util.*;
public class Pattern6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max rows:-");
        int r = sc.nextInt();
        int sum=1;
        System.out.println("The following pattern is:-");
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println(" ");
        }
    }
}
