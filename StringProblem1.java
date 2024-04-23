//Find the number is binary or not.
public class StringProblem1 {
    public static void main(String args[]) {
        int b = 101001;
        String str = String.valueOf(b);
        System.out.println(str);
        boolean s = str.matches("[01]+");
        System.out.println(s);
    }
}