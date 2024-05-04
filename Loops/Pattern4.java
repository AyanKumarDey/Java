package Loops;
import java.util.*;
public class Pattern4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max rows:-");
        int r = sc.nextInt();
        System.out.println("Enter the max columns:-");
        int c = sc.nextInt();
        int sum = 1;
        System.out.println("The following pattern is:-");
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.format("%02d ",sum);
                sum++;
            }
            System.out.println(" ");
        }
    }
}
