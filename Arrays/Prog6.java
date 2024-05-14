//Rotating An Array. (Right to Left)
package Arrays;
import java.util.*;
public class Prog6 {
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
        int temp = A[0];
        for(int i1=1;i1<A.length;i1++)
        {
            A[i1-1]=A[i1];
        }
        A[A.length-1]=temp;
        System.out.println("The rotated array is:-");
        for(int x1:A)
        {
            System.out.print(x1+" ");
        }
    }
}
