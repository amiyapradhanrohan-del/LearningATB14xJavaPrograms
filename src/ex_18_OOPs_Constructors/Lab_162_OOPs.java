package ex_18_OOPs_Constructors;

public class Lab_162_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby(); //Object is created
        new Baby();
        new Baby();
        Baby b2;

      //  System.out.println(b2.name); - no output, error will be there
    }

}

class Baby{
    String name;

    // Default Constructor also called
    Baby(){
        System.out.println("I am called, Object is created!");
    }
}
