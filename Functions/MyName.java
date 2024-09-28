package Functions;
import java.util.*;
public class MyName {
    public static void myname(String s1)
    {
        System.out.println("Hello Everyone My Name Is "+s1);
        return;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter your name:-");
        s = sc.nextLine();
        myname(s);
    }
}
