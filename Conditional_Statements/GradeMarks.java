package Conditional_Statements;
import java.util.*;
public class GradeMarks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("Enter the marks of the first subject:-");
        m1 = sc.nextInt();
        System.out.println("Enter the marks of the second subject:-");
        m2 = sc.nextInt();
        System.out.println("Enter the marks of the third subject:-");
        m3 = sc.nextInt();
        int total = m1+m2+m3;
        int avg = total/3;
        if(avg>=70)
        {
            System.out.println("Grade A");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.println("Grade B");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("Grade C");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}
