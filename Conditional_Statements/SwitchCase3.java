package Conditional_Statements;
import java.util.*;
public class SwitchCase3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website:-");
        String s1 = sc.nextLine();
        System.out.println("The website is = "+s1);
        int a = s1.lastIndexOf('.');
        String str = s1.substring(a+1);
        switch(str)
        {
            case "com" : System.out.println("The type of the website is commercial");
            break;
            case "org" : System.out.println("The type of the website is organizational");
            break;
            case "gov" : System.out.println("The type of the website is governmental");
            break;
            case "edu" : System.out.println("The type of the website is educational");
            break;
            case "net" : System.out.println("The type of the website is network");
            break;
            default : System.out.println("Invalid type of the website");
            break;
        }
    }
}
