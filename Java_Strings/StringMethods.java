package Java_Strings;

import java.util.*;
public class StringMethods {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = "HELLO World";
        String str= "  Hello  World   ";
        int a = str1.length();
        String str2 = str1.substring(6);
        String str5 = str1.substring(2,9);
        String str3 = str1.toUpperCase();
        String str4 = str1.toLowerCase();
        System.out.println("The length of the string is = "+a);
        System.out.println("The following substring is = "+str2);
        System.out.println("The uppercased string is = "+str3);
        System.out.println("The changed string is = "+str4);
        System.out.println("The following substring is = "+str5);
        String str6 = str.trim();
        System.out.println("The trimmed string is "+str6);
    }
}
