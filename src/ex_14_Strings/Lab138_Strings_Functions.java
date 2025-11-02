package ex_14_Strings;

import java.sql.SQLOutput;

public class Lab138_Strings_Functions {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);
        //character will never store in string constant pool. its an imposter.,its an integer. char A value is 65.

        String s1 = "ABCD";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));
// Here 4 strings are present i.e "ABCD" , s1.toLowerCase(), s1.toUpperCase(), s1.concat("E")
    }
}
//Output -
//A
//ABCD
//4
//abcd
//ABCD
//ABCDE
