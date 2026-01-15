package ex_19_OOPs_Part2.OOPs_01_inheritance.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        //Son can access both father and grand father class/properties
        Son pramod = new Son();
        pramod.home();
        pramod.bhk3();
        pramod.gf();
        pramod.extra();

        //Father can access his own class and grand father class
        Father f = new Father();
        f.gf();
        f.home();
        f.extra();

        //Grand father can access ony his class/properties
        GrandFather gf = new GrandFather();
        gf.home();
        gf.gf();

        // Dynamic Dispatch
        GrandFather g1 = new Son(); //This is possible i.e when son was born grand father was present
        Father f1 = new Son(); //This is possible i.e when son was born father was present
        // Son s1 = new GrandFather(); - This is not possible
        // Son s2 = new Father(); - This is not possible
    }
}
