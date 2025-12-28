package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        //Find the 2nd highest number in the Array
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);


    }
}
//Output = 34