package ex_10_For_Loop;

import java.util.Scanner;

public class Task4_Factorial_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int fact = 1;
        if (n == 0){ //we have used if condition because 0! = 1, to handle the edge case we have used if condition.
            fact = 1;
        }
        for (int i = 1; i <= n; i++){
    //   for (int i = 5; i >= 1; i--){ - We can do its reverse also
            fact = fact*i;

        }
        System.out.println(fact);
    }
}
