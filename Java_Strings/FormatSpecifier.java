package Java_Strings;

import java.util.*;
public class FormatSpecifier {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the values of two numbers:-");
        a = sc.nextInt();
        b = sc.nextInt();
        int add = a+b;
        System.out.printf("The addition of two numbers are = %d\n",add);
        //Format Specifier
        int c = 20;
        float f = 123.45789f;
        char a1 = 'A';
        String a2 = "Hello World";
        System.out.printf("%d %c %f %s\n",c,a1,f,a2);
        System.out.printf("%3$d %4$f %2$c %1$s\n",a2,a1,c,f); //Arguments
        System.out.printf("%10d\n",c);
        System.out.printf("%010d\n",c);
        System.out.printf("%-10d\n",c);
        System.out.printf("%7.2f\n",f);
        System.out.printf("%07.2f\n",f);
        System.out.printf("%20s\n",a2);
    }
}
