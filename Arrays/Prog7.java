//Rotating An Array. (Left to Right).
package Arrays;
import java.util.*;
public class Prog7 {
    public static void main(String[] args)
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
        System.out.println("The array is:-");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println(" ");
        int temp = A[A.length-1];
        for(int i=A.length-2;i>=0;i--)
        {
            A[i+1]=A[i];
        }
        A[0]=temp;
        System.out.println("The rotated array is:-");
        for(int x1:A)
        {
            System.out.print(x1+" ");
        }
    }
}
