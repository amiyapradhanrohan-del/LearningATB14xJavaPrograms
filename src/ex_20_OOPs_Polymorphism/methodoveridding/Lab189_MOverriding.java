package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab189_MOverriding {
    public static void main(String[] args) {
        // This concept is also called as Runtime Polymorphism

        Pramod p1 = new Pramod(); //This object is belong to child class, so child class methos will be called.
        p1.home();

     //   Father f1 = new Father(); - father class will be called
     //   f1.home();

    //    Father f2 = new Pramod(); - Here whoever object is that class will be called - clild class will be called
    //    f2.home(); - This concept is called as Dynamic Dispatch

    //    Pramod p1 = new Father(); -It can not be executed because when father is born child can not be present

    }
}
// ------------------Method Overriding------------------
class Father {
    void home() {
        System.out.println("2BHK");
    }
}

    class Pramod extends Father {
    @Override
        void home() {
            System.out.println("3BHK"); //whose ever object is created that class will be called
        }
    }

    //Output - 3BHK

//Override means similar name of function which is present in the parent class also.


