package Java_Strings;

import java.lang.*;
public class JavaStrings {
    public static void main(String args[]){
        String str1 = "Java Program"; //The string object is created in the pool & the literal is also stored in the pool.
        String str2 = "Java Program";
        String str3 = new String("Java"); //Over here the object is created in the heap & the string literal ("Java") is stored in the pool.
        String str4 = new String("Java Program");
        System.out.println(str1);
        System.out.println("To check whether both the strings belongs to same object or not:-"+(str1 == str2));
        System.out.println("To check whether both the strings belongs to same object or not:-"+(str1 == str4));
        System.out.println(str3);
        System.out.println(str4);
        char[] c = {'A','F','C','D'};
        byte[] b = {65,66,67,68};
        String str5 = new String(c); //Over here I have used String(char[]) constructer to convert a character array into a string.
        String str6 = new String(b); //Over here I have used String(byte[]) constructer to convert a byte array into a string.
        System.out.println(str5);
        System.out.println(str6);
    }
}
