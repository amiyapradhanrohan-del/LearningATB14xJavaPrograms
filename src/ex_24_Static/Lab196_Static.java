package ex_24_Static;

public class Lab196_Static {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(t1.driver); //Chrome
        System.out.println(Automation.driver); //Chrome
        Automation.driver = "Firefox";
        System.out.println(Automation.driver); //Firefox
        System.out.println(Automation.driver2); //null
    }
}

class Automation{
    static String driver = "Chrome";
    static String driver2;//default value will be assigned to it i.e null
}
