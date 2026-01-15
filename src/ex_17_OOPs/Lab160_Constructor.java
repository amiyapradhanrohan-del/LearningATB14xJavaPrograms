package ex_17_OOPs;

public class Lab160_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();//this full part is an object and Student() part is constructor
        //new is a keyword used for creating a new memory.
        Student s2 = new Student("Amiya");
    }
}

class Student {
    String name;

    //Default Constructor - it is created by JVM automatically
    Student(){//Student() is the automatic default constructor calling
        System.out.println("DC --> Hi, i am called.");
    }

    //Parameterized Constructor
    Student(String name){
        System.out.println("PC --> Hi," + name);
    }



    void sleep(){}
    void study(){}
    void eat(){}

}
