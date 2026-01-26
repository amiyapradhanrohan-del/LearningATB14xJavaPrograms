package ex_25_ENUM;

public class Lab197_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.SATURDAY);
        System.out.println(Day2.SATURDAY); //we can directly use it, my constant value are in a separate file
    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
//Output -
//SATURDAY
//SATURDAY
