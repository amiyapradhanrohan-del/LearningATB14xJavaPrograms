package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {

        // User Defined Functions.

        // 1. Without Parameters and Without Return Type
        // 2. Without Parameters but With Return Type
        // 3. With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        //----------Calling of the functions-------------
        // 1.Without Argument / Parameters and Without Return Type
        wop_wor_greet();

        // 2.Without Parameters but With Return Type
        String msg = wop_wr_greet_2();
        System.out.println(msg);

        // 3. With Parameters and Without Return Type
        greet_with_details("Amiya",28,100);
        greet_with_details("Ankit",29,120);

        // 4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(3,4);
        int sum2 = sum_of_two_numbers(190,900);
        int sum3 = sum_of_two_numbers(2345,5432);
        int sum4 = sum_of_three_numbers(2345,5432,5432);



    }
    //-----Declare / Define-----of the functions

    // 1. Without Parameters and Without Return Type

    static void wop_wor_greet(){
        System.out.println("Hi, Type 1 Function!");
        System.out.println("Hi, there!");
    }
    // 2. Without Parameters but With Return Type

    static String wop_wr_greet_2(){
        System.out.println("Hi, TYpe 2 Function!");
        return "Hi, How are you?";
    }
    // 3. With Parameters and Without Return Type - (90% of time we are going to use it)

    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour salary" + salary );
    }
    // 4. With Parameters and With Return Type

    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }

    static int sum_of_three_numbers(int a, int b, int c){
        return a+b+c;
    }

    static float sum_of_three_numbers_float(float a, float b, float c){
        return a+b+c;
    }



}
