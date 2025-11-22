package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";

        System.out.println(name.length()); //Output - 5
        System.out.println(name.charAt(3)); //Output - a
//      System.out.println(name.charAt(10)); //Output - Does not exist.

        // 2. concat()
        System.out.println(name.concat("Patel")); //Output - SonalPatel

        // 3. contains()
        System.out.println(name.contains("om")); //Output - false

        // 4. equals()
        System.out.println(name.equals("Sonal")); //Output - true

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal")); //Output - true

        // 6. indexOf // sonal -> ? o
        System.out.println(name.indexOf('o')); //Output - 1

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m")); //Output - 0 //it will always gives 1st index.

        // 7. length()
        System.out.println(name.length()); //Output - 5

        // 8. replace( , )
        System.out.println(name.replace('n','N')); //Output - SoNal

        // 9. substring()
        System.out.println(name.substring(1,3)); //Output - on

        // 10. toLowerCase()
        System.out.println("SONAL".toLowerCase()); //Output - sonal

        // 11. toUpperCase()
        System.out.println("sonal".toUpperCase()); //Output - SONAL

        // 12. startWith()
        System.out.println(name.startsWith("S")); //Output - true

        // 13. endsWith()
        System.out.println(name.endsWith("a")); //Output - false

        // 14. trim()
        String name3 = "     Sonal Harish    ";
        System.out.println(name3.trim()); //Output - Sonal Harish

        // 15. compareTo()
        System.out.println(name.compareTo("Sonal")); //Output - 0


        // ----------------
        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder); //Output - lanoS - String builder is mutable in nature, it will not create multiple copy.
        //it will delete the older Sonal and print the lanoS
    }
}
