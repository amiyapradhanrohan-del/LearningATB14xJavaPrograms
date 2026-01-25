package ex_23_OOPs_Super_Abstraction;

public class Lab190_Interview_Q {
}
interface I11{}
interface I12{}
class A1{}
class B1{}
// class Test2 extends A1,B1{} - Multiple extension of class is not allowed
class Test3 implements I11{}
class Test4 implements I12,I11{} //multiple interfaces are allowed
class Test5 extends A1 implements I11,I12{} //One class and 2 interface is allowed
//class Test5 implements I11 extends A{} //reverse is not allowed, extends will always come first
//interface I3 extends A1{} //interface extends a class is not possible, interface are incomplete they can not extend
