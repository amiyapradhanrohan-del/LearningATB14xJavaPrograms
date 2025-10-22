package ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
//            if (i%2 ==0){   //It is a false condition, it will print odd numbers.
             if (i%2 !=0){    // It is a correct condition, it will print even numbers.

                continue;
            }
//            System.out.println(i); //1,3,5,7,9....,49
        System.out.println(i); //2,4,6,8,......,50
        }
    }
}
//Output-
//2
//4
//6
//8
//10
//12
//14
//16
//18
//20
//22
//24
//26
//28
//30
//32
//34
//36
//38
//40
//42
//44
//46
//48
//50