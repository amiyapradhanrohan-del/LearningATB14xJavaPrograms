package ex_24_Static;

public class Lab194_Static_SIB {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A{
    static{
        System.out.println("Called only Once when the class is loaded");
        System.out.println("You can write a code reading a excel, file, database file");
    }

    static int a = 10;

    static void m1(){
        System.out.println("static function");
    }
}
//Output -
//Called only Once when the class is loaded
//You can write a code reading a excel, file, database file
