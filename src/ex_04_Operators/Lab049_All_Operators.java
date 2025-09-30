package ex_04_Operators;

public class Lab049_All_Operators {
    public static void main(String[] args) {
        boolean b1 = true;

        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        //Arithmetic Operator
        // +,-,%,/,*

        // Compound Assignment Operators
        int age = 10;
     //   age +=10; // += --> age = age + 10;
     //   age -=10; // -= --> age = age - 10;
        age /=10; // /= --> age = age / 10;
        System.out.println(age);

    }
}
