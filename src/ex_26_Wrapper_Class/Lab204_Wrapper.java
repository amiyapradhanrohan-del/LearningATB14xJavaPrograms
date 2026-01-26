package ex_26_Wrapper_Class;

public class Lab204_Wrapper {
    public static void main(String[] args) {
        //Boxing concept - Primitive to Wrapper conversion - AutoBoxing - JVM will do
        int a = 10;
        Integer b = a;
        System.out.println(b.intValue()); //this is wrapper class
        System.out.println(b); //this is primitive
        System.out.println(a); //this is primitive

        //Unboxing concept -(Wrapper data type to primitive conversion)
        Integer aa = 43;
        int a1 = aa; //Unboxing
        System.out.println(a1); //Output-43
    }
}

//Output -
//10
//10
//10
//43
