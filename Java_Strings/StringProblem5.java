package Java_Strings;

//Removing multiple space from the string and replacing them with single space.
public class StringProblem5 {
    public static void main(String args[]){
        String str = "abc bd  cd    efdg      gfth";
        System.out.println("The given string is = "+str);
        String str1 = str.replaceAll("\\s+"," ");
        System.out.println("The string with single space is = "+str1);
    }
}
