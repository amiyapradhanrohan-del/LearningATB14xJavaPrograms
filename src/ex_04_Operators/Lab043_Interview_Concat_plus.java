package ex_04_Operators;

public class Lab043_Interview_Concat_plus {
    public static void main(String[] args) {

        String first_name = "Amiya";
        String last_name = "Pradhan";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // it will behaves like a concatenation
        System.out.println(a + b + first_name + last_name);

        //BODMAS - Bracket of Div, Mul, Add, Sub
        System.out.println(first_name + last_name + (a + b));// Here it will behaves like a normal arithmetic
    }
}
