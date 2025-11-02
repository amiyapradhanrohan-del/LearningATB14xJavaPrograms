package ex_14_Strings;

public class LabStringExamples1 {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c); //Output - v

        int result = "abc".compareTo("ABC");
        System.out.println(result); //Output - 32 , 32 is the diff between their capita and small ASCII number.
        //If we compare between "abc" and "abc" then the output will be 0.

        int idx = "Java".indexOf("a");
        System.out.println(idx); //Output - 1

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2); //Output - 3

        boolean b = "  ".isEmpty();
        System.out.println(b); //Output - true

        String s11 = String.join("z-","Java", "Python");
        System.out.println(s11); //Output - Javaz-Python
        //it will join Java and Python
        //if we use only "-" then it will join by using "-"

        String s12 ="Java".replace('a','o');
        System.out.println(s12); //Output - Jovo

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1); //Output - true

        String b2 = "Java".concat("MAVA");
        System.out.println(b2); //Output - JavaMAVA

    }
}
