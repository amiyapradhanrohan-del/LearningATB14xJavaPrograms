package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab187_Interface_P1 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.drive(); //we are successfully hidden the Brakes and Engine, we are using it directly but
        //everything is hidden by using the interface.
        //Note-we can not create an interface object.
    }
}

class Car2 implements Brakes,Engine1{

    void drive(){ //drive function basically calls all the method which are present.
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void testEngine(){
        System.out.println("Override by the Car 1");
    }

    @Override
    public void applyBreak() {
        System.out.println("apply the Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start the Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the Engine");
    }
}

interface Brakes{
    void applyBreak();
}

interface Engine1 {
    void startEngine();

    void stopEngine();


    default void testEngine() {
        System.out.println("concrete complete");
    }

    default void testEngine1() {
        System.out.println("concrete complete");
    }
}
//Java allows complete functions also in interface by using default.

//Output -
//Start the Engine
//apply the Break
//Stop the Engine

