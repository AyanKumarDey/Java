package Functions;
import java.util.*;
public class Armstrong {
    public static void armstrong(int n1)
    {
        int n2,n3;
        n2=n3=n1;
        int r,count=0;
        int sum = 0;
        while(n1!=0)
        {
            n1=n1/10;
            count++;
        }
        while(n2!=0)
        {
            r=n2%10;
            sum+=(int)Math.pow(r,count);
            n2=n2/10;
        }
        if(sum == n3)
        {
            System.out.println("The number is Armstrong");
        }
        else
        {
            System.out.println("The number is not Armstrong");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n = sc.nextInt();
        armstrong(n);
    }
}
