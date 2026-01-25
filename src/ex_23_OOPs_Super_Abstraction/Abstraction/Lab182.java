package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        // Car
        Car tesla = new Car(300);
        tesla.drive();
    }
}

class Vehicle{
    public int maxSpeed = 180;

    void noTest(){
        System.out.println("Empty!");
    }

    Vehicle(){
        System.out.println("Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Parameterized Constructor");
    }
    Vehicle(int a, int b){
        System.out.println("Parameterized Constructor");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("Parameterized Constructor - argument");
    }

    void drive(){ //display function
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle{

    private int maxSpeed = 281;

    Car(){ //default constructor
        super(100);
    }

    Car(int a){
        System.out.println("Parameterized Constructor - Car");
    }

    void test(){}

    @Override
    void drive(){
        System.out.println("Over ridden the Vehicle");
        System.out.println(super.maxSpeed);//calling parents
        System.out.println(this.maxSpeed);//calling myself
        super.noTest();//calling parents
        this.test();//calling myself


    }

}



