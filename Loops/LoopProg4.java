//Sum of n natural numbers.
package Loops;
import java.util.*;
public class LoopProg4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max number:-");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("The total sum is = "+sum);
    }
}
