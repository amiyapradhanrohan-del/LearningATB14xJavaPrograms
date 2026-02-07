package ex_17_OOPs;

public class Student {
    String name;

    //Default Constructor - it is created by JVM automatically
    Student(){//Student() is the automatic default constructor calling
        System.out.println("DC --> Hi, i am called.");
    }

    //Parameterized Constructor
    public Student(String name, String number){
        System.out.println("PC --> Hi," + name);
    }



    void sleep(){}
    void study(){}
    void eat(){}

    public void printDetails() {

    }
}
