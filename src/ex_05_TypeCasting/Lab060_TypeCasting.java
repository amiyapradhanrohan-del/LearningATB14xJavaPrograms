package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 8598803179l;
        //short s = phone_no; //Narrowing - Implicit - It is not possible
        short s = (short)phone_no; //Narrowing - Explicit - It is possible
        System.out.println(s);

    }
}
