package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        non_return_type_function();

        String name = return_string_type_function();
        System.out.println(name);

        return_boolean();
        System.out.println(return_boolean());

        return_float_pi_value();
        System.out.println(return_float_pi_value());

        return_byte();
        System.out.println(return_byte());

        return_long();
        System.out.println(return_long());

    }

    static void non_return_type_function(){
        System.out.println("Hi,there, No Return function!");
    }

    // Return Type - which return a data type (int, String, char, boolean, float)
    static String return_string_type_function(){
        System.out.println("Hi, there, I will return something.");
        return "Amiya"; //Here String data type and return data type should be matched.
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float_pi_value(){
        return 3.14f;
    }

    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 10l;
    }

}
// Output -
//Hi,there, No Return function!
//Hi, there, I will return something.
//Amiya
//true
//3.14
//100
//10