public class JavaStrings4{
    public static void main(String args[]){
        int a = 1234;
        String s = "Hello Java ";
        String s1 = s.valueOf(a); //This method is used to convert anything into string it can be char , int , boolean etc.
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s+s1);
        boolean str = s.matches("Hello Java"); //Matching the whole string.
        System.out.println(str);
        String s2 = "a";
        boolean str1 = s2.matches("[abc]"); //Check's whether the character present
        // in the string is either a or b or c any one.(Only for strings with single characters).
        System.out.println(str1);
        String s3 = "d";
        boolean str2 = s3.matches("[^abc]"); //Check whether the given character a,b or c is present in the string with single character.
        System.out.println(str2);
        String s4 = "a3";
        boolean str3 = s4.matches("[abc][189]"); //Check both the characters [] = one character.
        // in the string first checks either anyone a,b,c are present or not then it checks the numbers either 1,8 or 9 is present or not.
        System.out.println(str3);
        String s5 = "a1";
        boolean str4 = s5.matches("[a-z][1-9]");
        System.out.println(str4);
        String s6 = "a";
        boolean str5 = s6.matches("A|B"); //Check whether the single character string contains either A or B not a or b.
        System.out.println(str5);
        boolean str6 = s5.matches("."); //Checks any single character string not two or more characters string.
        System.out.println(str6);
    }
}