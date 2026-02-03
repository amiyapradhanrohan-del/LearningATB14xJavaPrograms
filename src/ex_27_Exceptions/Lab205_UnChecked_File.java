package ex_27_Exceptions;

public class Lab205_UnChecked_File {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = b/a; // java.lang.ArithmeticException
        System.out.println(c);

        //The UnChecked exceptions are -
        //Arithmetic Exception
        //Null pointer exception

        String name = null;
        name.trim();//java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
    }
}
