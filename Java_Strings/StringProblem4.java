package Java_Strings;

//Remove extra symbols from the string.
public class StringProblem4 {
    public static void main(String args[]){
        String str = "aa##s@d$f%g^h&JG897UI*";
        System.out.println("The given string is = "+str);
        String str1 = str.replaceAll("[^a-z0-9A-Z]*","");
        System.out.println("The string with no symbols is = "+str1);
    }
}
