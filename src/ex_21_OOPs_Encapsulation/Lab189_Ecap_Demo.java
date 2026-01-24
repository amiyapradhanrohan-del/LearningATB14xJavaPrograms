package ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {

        VWOLogin vwoLogin = new VWOLogin("admin","pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin","pwd123");
 //       System.out.println(vwoLogin1.password); -we can not access password, it is private

        String pass = vwoLogin1.getPassword();
        System.out.println(pass);
       // vwoLogin1.setPassword(); -Not allowed, anybody can not set the password
        vwoLogin1.setPassword("Pramodchild@123",true);

    }
}
// Public class
class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username,String password){
        this.password = password;
        this.username = username;
    }
}
// Private class
class GoodVWOLogin{
    //Instance Variable | Data variable | Attributes | Fields | properties | member variable
    private String username;
    private String password;

    GoodVWOLogin(String username,String password){
        this.password = password;
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
 //  public void setPassword(String password){ - Not allowed to set the password, anybody can not set the password
 //      this.password = password;
 //   }
    public void setPassword(String password, boolean isGoodAuntyAdmin) {
        if (isGoodAuntyAdmin) {
            this.password = password;
        } else {
            System.out.println("Not Allowed!");
        }
    }
}
//Output -
//pass123
//345
//pwd123





