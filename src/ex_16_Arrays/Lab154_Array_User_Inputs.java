package ex_16_Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array(int)");
        int size = scanner.nextInt();

        String[] number_marks = new String[size];

        for (int i = 0; i < number_marks.length; i++){
            System.out.println("Enter the elements -> " + i);
            number_marks[i] = scanner.next();
        }

        //To print the array
        System.out.println("------Print the values------");

        Arrays.sort(number_marks);
        for(String marks : number_marks){
            System.out.println(marks);
        }
    }
}
//Output -
//Enter the size of an array(int)
//3
//Enter the elements -> 0
//10
//Enter the elements -> 1
//20
//Enter the elements -> 2
//30
//------Print the values------
//10
//20
//30