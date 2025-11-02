package ex_14_Strings;

public class LabStringExample3 {
    public static void main(String[] args) {
        String s = "Java".substring(2); //It will display from index 2 to end
        System.out.println(s); //Output - va

        String s1 = "Java".substring(1, 3);
        System.out.println(s1); //Output - av

        char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']
        //Output - Java

        String st = "  Java  ".trim(); //trim will remove the extra spaces
        System.out.println(st); //Output - Java

        boolean b = "   ".isBlank();
        System.out.println(b); //Output - true

        String s2 = "ab".repeat(3);
        System.out.println(s2); //Output - ababab

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11); //Output - true

        long count = "a\nb\nc".lines().count(); //it will count lines - a , b , c
        System.out.println(count); //Output - 3
    }
}
