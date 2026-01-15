package ex_17_OOPs;

public class Lab161_Cats_OOPs {
    public static void main(String[] args) {
        Cat c1;
        Cat c2;
        Cat c23 = new Cat();
        Cat c24 = new Cat("Lucy");
        Cat c25 = new Cat("Spicy");
        new Cat();

        System.out.println(c24.name);
        System.out.println(c25 .name);

        c24.running();
        c25.running();
    }
}

class Cat{
    String name; //This is an instance variable, created within the class
    Cat() {
        name = "Kitty";
    }

    Cat(String nameParam){
        this.name = nameParam; //"this" is a keyword which reference to the current object.
    }

    void running(){
        int local_var = 10; //This is a local variable,within the function/method
        System.out.println("Who is running --> " + this.name);

    }
}
