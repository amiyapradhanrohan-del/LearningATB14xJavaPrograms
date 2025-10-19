package ex_07_Increment_Decrement_Op;

public class Lab073_ID {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a); //11
        System.out.println(result); //10 - Post increment - first assign the value then increase the value.
    }
}
