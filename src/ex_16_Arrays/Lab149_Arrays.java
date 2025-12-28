package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a = 10; //This is not an Array, its a normal declaration.
        int marks[] = {91, 90, 51, 100, 91, 92, 89};

        boolean[] is_married_people = {true, true, false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);

        String name ="pramod"; //Character array
        String[] name_each_element_char = name.split(""); //split method is used to display a proper string array
        for (String s: name_each_element_char){
            System.out.println(s);
        }
    }
}
//Output - 7
//91
//91
//p
//r
//a
//m
//o
//d