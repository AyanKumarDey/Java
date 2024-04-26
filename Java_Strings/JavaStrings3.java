package Java_Strings;

public class JavaStrings3 {
    public static void main(String args[]){
        String str = "JAVA";
        String str1 = "JAVA";
        boolean a = str.equals(str1);
        boolean b = str.equalsIgnoreCase(str1);
        String str2 ="java";
        int b1 = str.compareTo(str1);
        int a1 = str2.compareTo(str1); //If str2 > str1 then o/p positive if str2 < str1 then o/p negative and if both equal then 0
        System.out.println(a);
        System.out.println(b);
        System.out.println(a1); //It checks according to ASCII value small j is greater than J.
        System.out.println(b1); //Same string output zero.
        String s1 = "Hello Java";
        String s2 = "Hello Java";
        String s3 = new String("Hello Java");
        boolean b2 = s1.equals(s3); //It only checks the similarity between strings.
        System.out.println(b2);
        System.out.println(s1==s3); //It checks both strings as well as it's object.
    }
}
