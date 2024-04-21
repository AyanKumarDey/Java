public class JavaString5 {
    public static void main(String args[]){
        String s = "programmer@gmail.com";
        int i = s.indexOf('@');
        String s1 = s.substring(0,i);
        String s2 = s.substring(i+1,s.length());
        boolean str = s2.matches("gmail.com");
        System.out.println("Username = "+s1);
        System.out.println("Domain Name = "+s2);
        System.out.println(str);
    }
}
