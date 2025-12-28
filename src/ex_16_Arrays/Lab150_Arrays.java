package ex_16_Arrays;

public class Lab150_Arrays {
    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5, 6}; //1st way to create the array

        // 2nd way to create the array by using the size
        int[] mark2 = new int[5];
        int[] mark3 = new int[5]; // Fixed size

        String[] names = new String[3];
        names[0] = "pramod";
        names[1] = "Amit";
        names[2] = "Yasho";

        System.out.println(marks[0]); //Output = 1
        System.out.println(mark2[0]); //Output = 0
    }
}
