package ex_23_OOPs_Super_Abstraction;

public class Lab184_Private {

}

class XYZ {
    XYZ() {
    }
    protected int my_gold = 10; //If it will be "private" variable then it can not be access.
}

class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);//We can access our parent gold(protected variable can be access)
    }
}
//Note - "Protected" variable can be access by child class, "private" variable can not be accessed by child class.
//"default" and "public" variable can be access by child class.
