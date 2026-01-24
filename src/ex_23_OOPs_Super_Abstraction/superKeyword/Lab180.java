package ex_23_OOPs_Super_Abstraction.superKeyword;

public class Lab180 {

}

class BaseClass{

    BaseClass(){
        System.out.println("Default constructor - Parent");
    }
    BaseClass(String brower){
        this.browser=browser;
        System.out.println("Parameterized constructor - Parent");
    }

    private String browser;

    public String getBrowser(){
        return browser;
    }

    public void setBrowser(String browser){
        this.browser = browser;
    }

    void openBrowser(){
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser!! --> " + browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser!!");
    }
}
class TestCase extends BaseClass{

    void testC(){}

    TestCase(){
        //super(); //Default Constructor
        super("Chrome"); //Parameterized Constructor
        super.openBrowser(); //Normal - T1
        super.openBrowser("Chrome"); //Type 3
        super.closeBrowser(); //Normal
        System.out.println(super.getBrowser()); // Get
        super.setBrowser("firefox"); // Set

    }

}
