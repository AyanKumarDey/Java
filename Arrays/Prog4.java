//Finding the highest element in the array.
package Arrays;
import java.util.*;
public class Prog4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<A.length;i++)
        {
            int n1 = sc.nextInt();
            A[i]=n1;
        }
        System.out.println(" ");
        System.out.println("The array is:-");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println(" ");
        int max = A[0];
        for(int i=0;i<A.length;i++)
        {
            if(max<A[i])
            {
                max = A[i];
            }
        }
        System.out.println(" ");
        System.out.println("The highest elements in the array is = "+max);
    }
}
