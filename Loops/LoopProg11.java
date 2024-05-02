//Display the number in words with trailing zero.
package Loops;
import java.util.*;
public class LoopProg11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose words are to be found:-");
        int num = sc.nextInt();
        int r;
        String str = "";
        while(num>0)
        {
            r = num%10;
            num = num/10;
            str += r;
        }
        System.out.println("The number in words is:-");
        for(int i=str.length()-1;i>=0;i--)
        {
            char c = str.charAt(i);
            if(c == '0')
            {
                System.out.print("ZERO ");
            }
            else if(c == '1')
            {
                System.out.print("ONE ");
            }
            else if(c == '2')
            {
                System.out.print("TWO ");
            }
            else if(c == '3')
            {
                System.out.print("THREE ");
            }
            else if(c == '4')
            {
                System.out.print("FOUR ");
            }
            else if(c == '5')
            {
                System.out.print("FIVE ");
            }
            else if(c == '6')
            {
                System.out.print("SIX ");
            }
            else if(c == '7')
            {
                System.out.print("SEVEN ");
            }
            else if(c == '8')
            {
                System.out.print("EIGHT ");
            }
            else if( c== '9')
            {
                System.out.print("NINE ");
            }
        }
    }
}
