package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_BANK {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        long bal = amit.getBal();
        System.out.println(bal); //Amit can see the balance by using getBal() function
 //       System.out.println(amit.bal); - Amit can't see the balance, it is private

        //Cashier can set the balance
        ICICIBank cashier = new ICICIBank("Cash", 100);
        cashier.setBal(200,true);
        System.out.println(cashier.getBal());

    }
}
class ICICIBank {
    private String name;
    private long bal;

    //Constructor will be always public in nature.
    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

//    public void setBal(long bal) { //Not allowed to set the Balance
//    this.bal = bal;
//    }


    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not Allowed!!");
        }
    }
}

//Output -
//100
//200

