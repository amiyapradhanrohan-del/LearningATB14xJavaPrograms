package ex_14_Strings;

public class LabStringExample2 {
    public static void main(String[] args) {
        CharSequence s = "Pramod".subSequence(1,4); //Character sequence - 012345
        System.out.println(s); //4 is always n-1
    }
}
//Output - ram
//sub string will be always n-1 , starting index and ending index -1