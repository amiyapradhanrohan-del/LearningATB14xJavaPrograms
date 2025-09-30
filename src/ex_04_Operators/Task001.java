package ex_04_Operators;

public class Task001 {
    public static void main(String[] args) {

        // Print the table of 9 or 5 using the System.out.printf
        int num = 9;
        // 9*1=9
        // 9*2=18
        // 9*2=27
        // int --> %d, String --> %s, Char --> %c, float --> %f
        System.out.printf("%d*1=%d",num,num*1).println();
        System.out.printf("%d*2=%d",num,num*2).println();
        System.out.printf("%d*3=%d",num,num*3).println();
        System.out.println("...");
        System.out.printf("%d*9=%d",num,num*9).println();
        System.out.printf("%d*10=%d",num,num*10).println();


        //printf is only used for formatting purpose

    }
}
