package Conditional_Statements;
import java.util.*;
public class WebsiteCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website url:-");
        String web = sc.nextLine();
        int a = web.indexOf(':');
        int a1 = web.lastIndexOf('.');
        String str = web.substring(0,a);
        String str1 = web.substring(a1+1);
        System.out.println("The website is = "+web);
        if(str.equals("http")) //For example str = "Hello" so you should use str.equals("Hello") not str == "Hello" this will not accept but their will be no compilation error.
            // But if we store the "Hello" in second variable like str1 = "Hello" then str == str1 then okay.
        {
            System.out.println("The protocol is Hyper Text Transfer Protocol");
            if(str1.equals("com"))
            {
                System.out.println("The type of website is commercial");
            }
            else if(str1.equals("gov"))
            {
                System.out.println("The type of the website is governmental");
            }
            else if(str1.equals("edu"))
            {
                System.out.println("The type of the website is educational");
            }
            else if(str1.equals("org"))
            {
                System.out.println("The type of the website is organizational");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
        else if(str.equals("ftp"))
        {
            System.out.println("The protocol is File Transfer Protocol");
            if(str1.equals("com"))
            {
                System.out.println("The type of website is commercial");
            }
            else if(str1.equals("gov"))
            {
                System.out.println("The type of the website is governmental");
            }
            else if(str1.equals("edu"))
            {
                System.out.println("The type of the website is educational");
            }
            else if(str1.equals("org"))
            {
                System.out.println("The type of the website is organizational");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
