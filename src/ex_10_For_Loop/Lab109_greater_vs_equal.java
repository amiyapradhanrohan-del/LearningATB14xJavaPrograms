package ex_10_For_Loop;

public class Lab109_greater_vs_equal {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {  // Output - 0 to 10, 11 times
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {  // Output - 1 to 10, 10 times
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {  // Output - 0 to 9, 10 times
            System.out.println(i);
        }
    }
}