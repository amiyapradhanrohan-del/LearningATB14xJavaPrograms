package ex_23_OOPs_Super_Abstraction.superKeyword;

public class Lab181_Super {
}

class Father{
    Father(){
        System.out.println("Default Constructor - Father");
    }

    int gold = 10;

    void home(){
        System.out.println("Home of Father");
    }
}

class Son extends Father{
    Son(){
        super();
    }
    int gold_c = 100;
    void bike(){}

    void newHome(){
        System.out.println(super.gold); //To call father gold we have to use - super.gold
        super.home(); //To call fathers home super keyword is used
        this.bike(); //To call my own function we have to use "this" keyword
        System.out.println(this.gold_c); //To call my own gold we have to use - this.gold_c
    }
}
