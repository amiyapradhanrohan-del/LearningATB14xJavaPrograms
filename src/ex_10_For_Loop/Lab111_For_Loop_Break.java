package ex_10_For_Loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        for (int i=0; i<50; i++){  //Output = 0 to 49, Times : 50
 //           System.out.println(i);  //Output = 0 to 5

            if (i ==5){
                break;
            }    //First exit from the loop then we are printing
            System.out.println(i); //Output = 0 to 4 becase exactly at i==5 we are out of the loop so 5 will not print.
        }
    }
}
