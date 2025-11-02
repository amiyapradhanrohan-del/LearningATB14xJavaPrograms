package ex_14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1.concat("world");
        System.out.println(s1);

        //Output - helloworld
        // Here 2 strings are present in the string constant pool. i.e hello, world
    }
}
