package ex_27_Exceptions;

import java.util.Scanner;

public class Lab222_ThrowExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age\n");
        int user_age = scanner.nextInt();
        validate_age_for_club(user_age);

    }

    static void validate_age_for_club(int age) throws Exception {
        if(age < 25){
            throw new Exception("Age can't be less than 25");
        }else{
            System.out.println("Enjoy clubbing");
        }
    }
}

//Enter the age user input -
//Output -
//Enter your age
//10
//Age can't be less than 25

//Enter your age
//26
//Enjoy clubbing

