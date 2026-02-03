package ex_27_Exceptions;

public class Lab212_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 1;
        int c = 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will be always executed!");
        }
        System.out.println(c);
    }
}
//finally means it will always executed, does not matter wheather it is a try condition or catch condition.

//Output -
//  / by zero
//I will be always executed!
//0
