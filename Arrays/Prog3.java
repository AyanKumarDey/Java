//Finding a element from the array.
package Arrays;
import java.util.*;
public class Prog3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the element which to be searched from the array:-");
        int key = sc.nextInt();
        System.out.println("Enter the elements in the array:-");
        for(int i=0;i<A.length;i++)
        {
            int n1 = sc.nextInt();
            A[i]=n1;
        }
        System.out.println(" ");
        System.out.println("Checking the element is present or not:-");
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==key)
            {
                System.out.println("The element is found at index no. "+i+" from the array.");
                System.exit(0); //Getting out from the entire code not from the loop.
            }
        }
        System.out.println("The element is not found");
    }
}
