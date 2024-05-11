//The sum of all elements in the array.
package Arrays;
import java.util.*;
public class Prog2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        int n = sc.nextInt();
        int[] A = new int[n];
        int sum = 0;
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<A.length;i++)
        {
            int n1 = sc.nextInt();
            A[i]=n1;
        }
        System.out.println("The array is:-");
        for(int i=0;i<A.length;i++)
        {
            sum+=A[i]; // This means sum = sum+A[i];
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
        System.out.println("The sum of all the elements in the array is = "+sum);
    }
}
