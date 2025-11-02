package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";
        //Only 1 string is present.

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");
        // 3 strings are present

        // == -> Comparison -> String => this check the reference location
        System.out.println(s1 == s3); //Output - false
        System.out.println(s1 == s2); //Output - false
        System.out.println(s2 == s3); //Output - false
        System.out.println(s1 == s4); //Output - true
        System.out.println(s3 == s5); //Output - false

        // equals operator (content) -> it checks the value.
        System.out.println(s1.equals(s2)); //Output - true
        System.out.println(s1.equals(s3)); //Output - true
        System.out.println(s3.equals(s5)); //Output - false
        System.out.println(s3.equalsIgnoreCase(s5)); //Output - true

        //equalsIgnoreCase also match -> pramod, Pramod, PRAMOD, PraMod, PramoD
        // == - check for the ref
        // = assignment the value
    }
}
