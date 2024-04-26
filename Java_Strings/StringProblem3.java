package Java_Strings;

//To check the string in format dd/mm/yyyy.
public class StringProblem3 {
    public static void main(String args[]){
        String str = "10/12/2003";
        System.out.println("The given string is = "+str);
        boolean s = str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}");
        System.out.println(s);
    }
}
