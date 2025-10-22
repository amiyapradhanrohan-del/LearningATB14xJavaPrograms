package ex_10_For_Loop;

public class Lab107_ForLoop_2 {
    public static void main(String[] args) {
        for (long i = 1l; i<10; i++){
            System.out.println(i);
        }
        for (float f=0.0f; f<10.67; f++){
            System.out.println("Hi,Float -> "+f);
        }
    }
}
// It is executed successfully. but nobody used it because it's confusing.

//Output
//1
//2
//3
//4
//5
//6
//7
//8
//9
//Hi,Float -> 0.0
//Hi,Float -> 1.0
//Hi,Float -> 2.0
//Hi,Float -> 3.0
//Hi,Float -> 4.0
//Hi,Float -> 5.0
//Hi,Float -> 6.0
//Hi,Float -> 7.0
//Hi,Float -> 8.0
//Hi,Float -> 9.0
//Hi,Float -> 10.0