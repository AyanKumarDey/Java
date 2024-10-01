package Functions;
import java.util.*;
public class PerimeterOfRectangle {
    public static void rectangle(int l,int b)
    {
        int perimeter = l*b;
        System.out.println("The perimeter of the rectangle is "+perimeter);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int length,breadth;
        System.out.println("Enter the length & breadth of the rectangle:-");
        length = sc.nextInt();
        breadth = sc.nextInt();
        rectangle(length,breadth);
    }
}
