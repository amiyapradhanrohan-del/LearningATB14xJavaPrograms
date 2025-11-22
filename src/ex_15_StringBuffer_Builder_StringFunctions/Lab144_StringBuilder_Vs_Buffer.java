package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90% of the time we will use StringBuilder
        String s0 = "Pramod";
        String s1 = new String("Pramod");

        // less than 10% of the time we will use StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Pramod"); //threat safe
        StringBuilder stringBuilder = new StringBuilder("Pramod"); //not threat safe


        System.out.println(stringBuffer); //Output - Pramod
        System.out.println(stringBuilder); //Output - Pramod
        System.out.println(stringBuffer.reverse()); //Output - domarP
        System.out.println(stringBuilder.reverse()); //Output - domarP
    }
}
