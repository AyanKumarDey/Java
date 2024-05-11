package Arrays;
import java.util.*;
public class Prog1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Three types of array declaration.
        System.out.println("Enter the length of the array:-");
        int n = sc.nextInt();
        int[] A = new int[n]; //Java uses this style of writing array.(This array are having null values means print them will only show zero's.
        int A1[] = new int[n]; //We can declare array like this also.
        int[] A2 = {1,2,3,4,5};
        int A3[];
        A3 = new int[6];
        //Now traversing an array:- (The whole traversing is done using for loop).
        System.out.println("Forward traverse");
        for(int i=0;i<A2.length;i++) //Loop from 0 to 4. (A.length = 5) therefore 5-1 times.
        {
            System.out.print(A2[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Backward traverse");
        for(int i1=A2.length-1;i1>=0;i1--)
        {
            System.out.print(A2[i1]+" ");
        }
        System.out.println(" ");
        System.out.println("Now using for each loop");
        for(int x:A2)//It only can traverse in forward direction not backward.
        {
            System.out.print(x+" ");
        }
        System.out.println(" ");
        //Giving the values to an array.
        System.out.println("Enter the values of the array:-");
        for(int i=0;i<A.length;i++)//The value of the array A[n] is given size id n.
        {
            int n1 = sc.nextInt();
            A[i]=n1;
        }
        System.out.println("The user input array is:-");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
    }
}
