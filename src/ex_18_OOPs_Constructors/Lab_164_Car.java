package ex_18_OOPs_Constructors;

public class Lab_164_Car {
    public static void main(String[] args) {
        LoginPage l = new LoginPage(); //If we called, the default constructor will be automatically called

        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);
    }
}


