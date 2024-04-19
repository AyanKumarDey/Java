import java.util.*;
public class JavaStrings2 {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String:-");
      String str1 = sc.nextLine();
      System.out.println("The user input string is = "+str1);
      String s1 = str1.toUpperCase();
      String str2 = "Hello Java";
      char s = str2.charAt(4);
      int b = str2.indexOf('l');//Provides the first index of the character of the string.
      String c = str2.replace("e","i"); //Use to replace a character from the strings.
      System.out.println(s1);
      System.out.println(str2);
      System.out.println(s);
      System.out.println(b);
      System.out.println(c);
      boolean s2 = str2.startsWith("Hello"); //The first string matches so o/p true.
      boolean s4 = str2.endsWith("java"); //The last string doesn't math so o/p will be false.
      int s3 = str2.lastIndexOf('l'); //Provides the last index of the string.
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);
  }
}