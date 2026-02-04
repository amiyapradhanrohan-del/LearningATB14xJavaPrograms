package ex_29_Generics;

public class Lab224 {
    public static void main(String[] args) {
        temp_sum_t(10,10);
        temp_sum_t(10.34,10.45);
        temp_sum_t("Pramod","Dutta");
    }

//    static Integer temp_sum(Integer a, Integer b){
//        return a+b;
//    }
//    static Double temp_sum(Double a,Double b){
//        return a+b;
//    }

    static <T> T temp_sum_t(T a, T b){//it does not matter which data type is coming this will be replaced with  the data type
        //we can give any name instead of T, it is just a place holder
        return null;//we don't know what data type will be returned, so we mention null.
    }

    static <MODI> MODI temp_sum1(MODI a, MODI b){
        return null;
    }
}
//Generic says that we don't have to mention about the data types,i will replace it according to the called function.

//null is not a string., default value of null is string