package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab190_Methodoverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC(); //Chrome Browser will be called
        c1.openBrowser();

        FirefoxTC f1 = new FirefoxTC(); //Firefox Browser will be called
        f1.openBrowser();

        CommonToAll commonToAll = new CommonToAll(); //IE Browser will be called
        commonToAll.openBrowser();

        //Dynamic dispatch concepts
        CommonToAll c2 = new ChromeTC(); //Chrome Browser will be called
        c2.openBrowser();

        CommonToAll c3 = new FirefoxTC();
        c3.openBrowser();

//        ChromeTC cc = new FirefoxTC(); -It will not be executed,there is no relationship between Chrome & Firefox

    }
}
    class CommonToAll{
        void openBrowser(){
            System.out.println("Starting the IE browser.");
        }
    }

    class ChromeTC extends CommonToAll{
        @Override
        void openBrowser(){
            System.out.println("Starting Chrome, Better Browser!!");
        }
    }

    class FirefoxTC extends CommonToAll{
        @Override
        void openBrowser(){
            System.out.println("Starting FirefoxTC Better Browser!!");
        }
    }

