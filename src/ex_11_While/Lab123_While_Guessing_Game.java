package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        // n = 56
        // 90, 60, 50 -> 50 to 60 yes

        Random random = new Random(); //Random is a class it will give you any integer.
        int numberTOGuess = random.nextInt(101);
  //      System.out.println(numberTOGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number"); // Here we will ask user to enter a number.
        int guess;
        int attempts = 0;

        while (true){  //we are using while loop because here we can control the entry.
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); //Consume invalid token
                continue;
            }

                guess = scanner.nextInt(); //it will give the number.
                attempts++;

                if(guess < 1 || guess > 100){
                    System.out.println("Please enter a number between 1 and 100");
                    continue;
                }

                if(guess < numberTOGuess){
                    System.out.println("Too low, try again");
                }else if (guess > numberTOGuess){
                    System.out.println("Too high, try again");
                }
                else{
                    System.out.println("Correct! You guess it in " + attempts + " attempts ");
                    break;
                }
            }
        }
    }


