package ex_18_OOPs_Constructors;

public class Car2 {

    String model;
    int year;

    //Default constructor

    Car2(){
        model = 'XXX';
        year = 1900;
        System.out.println("DC");
    }
    //Parameterized constructor

    Car2(String model_name,int year_created){
        this("i10"); //Constructor chaining
        this.model = model_name;
        this.year = year_created;
    }

    //we can also create one more parameterized constructor with only one value

    Car2(String model_name){
        this();
        this.model = model_name;
    }

}
//This is called constructor overloading - Same name with different parameters
//Constructor chaining - one constructor can be called by another constructor