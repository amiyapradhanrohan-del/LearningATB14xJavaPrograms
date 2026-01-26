package ex_26_Wrapper_Class;

public class Lab202_Wrapper_Conversion {
    public static void main(String[] args) {
        int a = 10;
        //Primitive data types has no attributes and methods
        // a. // no attribute
        // a.len() //no method
        Integer a1 = 10; //this is having no attribute and behaviour
        System.out.println(Integer.MAX_VALUE); //this is attribute
        System.out.println(Integer.valueOf(a1)); //this is behaviour
        System.out.println(a1.intValue());//this is behaviour
    }
}

//Output -
//2147483647
//10
//10
