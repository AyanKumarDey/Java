//Finding the Second_Highest element in the array.
package Arrays;
import java.util.*;
public class Prog5 {
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
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
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
        System.out.println("The max element in the array is = "+max);
        int max2 = A[0];
        for(int i1=0;i1<A.length;i1++)
        {
            if((max2<A[i1]) && (A[i1]!=max))
            {
                max2 = A[i1];
            }
        }
        System.out.println("The second highest element in the array is = "+max2);
    }
}
