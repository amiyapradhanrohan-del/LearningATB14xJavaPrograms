package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab186_Better_Abstract_Class {
    public static void main(String[] args) {
    Alto a = new Alto();
    a.drive();

    }
}


abstract class Car1{

    abstract void startCar();
    abstract void stopCar();
}

class Alto extends Car1 implements Tyre,Gear,Engine{

    void drive(){
        rubberTyre();
        blackColorDoToTyre();
        this.startCar();
        this.startEngine();
        changeGear();
        this.stopCar();
    }

    @Override
    void startCar() {
        System.out.println("Starting the Car");
    }

    @Override
    void stopCar() {
        System.out.println("Stop the Car");
    }

    @Override
    public void changeGear() {
        System.out.println("Change the Gear of Car");
    }

    @Override
    public void rubberTyre() {
        System.out.println("rubberTyre of the car");
    }

    @Override
    public void blackColorDoToTyre() {
        System.out.println("blackTyre of the car");
    }

    @Override
    public void startEngine() {
        System.out.println("Start the Engine");
    }
}

interface Tyre{
    abstract void rubberTyre(); //interface is bydefault abstract.
    void blackColorDoToTyre();// it is bydefault abstract.
}

interface Gear{
    void changeGear();
}

interface Engine{
    void startEngine();
}

//Abstraction is used to hide by the interfaces and by using the abstract class also.
//Abstract can be only a method or class and can not be a constructor


//Output -
//rubberTyre of the car
//blackTyre of the car
//Starting the Car
//Start the Engine
//Change the Gear of Car
//Stop the Car