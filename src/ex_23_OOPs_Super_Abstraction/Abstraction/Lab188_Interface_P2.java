package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab188_Interface_P2 {
}

interface I1{//1st interface
    void icm1();
    void icm2();
}

interface I2{//2nd interface
    void icm3();
}

class P implements I1,I2{ //class where we can implement both of them

    @Override
    public void icm1() {

    }

    @Override
    public void icm2() {

    }

    @Override
    public void icm3() {

    }
}