package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.add(3,4); //Whatever data types/parameters/arguments we will call here, it will execute that class only.
    }

}
    class Calc {

        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;

        }

        long add(long a, int b){
            return a+b;
        }
    }

