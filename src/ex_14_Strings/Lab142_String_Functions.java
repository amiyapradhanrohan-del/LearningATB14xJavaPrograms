package ex_14_Strings;

public class Lab142_String_Functions {
    public static void main(String[] args) {
        // String s1 = "HELLO"; -> It is store in string constant pool
        // String s2 = new String("world"); -> It is store in object area
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); //Output - true
        System.out.println(str1 == str3); //Output - false
        System.out.println(str1.equals(str3)); //Output - true

        System.out.println(str1.concat(str3)); //Output - HelloHello
    }
}
