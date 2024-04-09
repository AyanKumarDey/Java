import java.util.*;
public class AreaOfTriangle2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        float S;
        System.out.println("Enter the three sides of the triangle:-");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        S = (0.5f)*(a+b+c);
        double area;
        area = Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("The area of the triangle is = "+area);
    }
}
