//Find the number is HexaDecimal or not.
public class StringProblem2 {
    public static void main(String args[]){
        String str = "0123AF";
        System.out.println(str);
        boolean s = str.matches("[0-9A-F]*");
        System.out.println(s);
    }
}
