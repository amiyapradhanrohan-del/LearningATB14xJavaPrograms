package ex_27_Exceptions;

public class Lab221_CustomException {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        Integer total_bal = sbi.add(icici);
        System.out.println(total_bal); //Output - 223


        Bank jp_chase = new Bank("USD",101);
        Integer total_bal_all_countries = sbi.add(jp_chase);
        System.out.println(total_bal_all_countries); //Here currency is Mismatch
    }
}

class Bank{
    private String currency;
    private Integer amount;

    //Parameterized constructor
    public Bank(String currency, Integer amount){
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception { //throws is used to handle the exception
        try {
            if (!bankName.currency.equalsIgnoreCase("INR")){
                throw new CustomException("Currency Mismatch, Can't Proceed!"); //throw is used to throw the custom exception
            }
            return bankName.amount + this.amount;
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}

class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}

//Output -
//223
//Currency Mismatch, Can't Proceed!
