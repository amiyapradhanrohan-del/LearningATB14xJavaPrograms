package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        //How to find out the largest number in an array
        //logic by using the inbuild function

//        Arrays.sort(array); //To sort an array from smallest to largest
//        System.out.println(array[array.length-1]); //To print the largest number in an array
//        System.out.println(array[0]); //To print the smallest number in an array

        //Output -
        // 77
        // 14

 //       int max = array[0];
 //       for (int i = 0; i < array.length; i++){
 //       if(array[i] > max){
 //               max = array[i];
  //          }
  //      }
//        System.out.println(max); //Output - 77

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min); //Output - 14





    }
}
