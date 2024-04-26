package Java_Strings;//Here is the concatenation of two strings.
import java.util.*;
public class Concat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:-");
        java.lang.String name;
        name = sc.nextLine();
        System.out.println("Enter your place:-");
        java.lang.String place;
        place = sc.nextLine();
        java.lang.String concat;
        concat = "Name:-"+name + " Place:-" + place;
        System.out.println("The concatenated string is = "+concat);
    }
}
