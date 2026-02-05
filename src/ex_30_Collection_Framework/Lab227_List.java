package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List {
    public static void main(String[] args) {
        List fruits = List.of("orange","apple","guave","mango","watermelon");
        System.out.println(fruits);//Output - [orange, apple, guave, mango, watermelon]


        List arrayList = new ArrayList();
        //All these are wrapper functions, wrapper data types, these are not primitive data types
        arrayList.add("pramod");
        arrayList.add("pramod");//arraylist can store duplicate values
        arrayList.add("dutta");
        arrayList.add(true); //boolean
        arrayList.add(1.23); //
        arrayList.add(123);
        //Primitive data types are never supported here

        System.out.println(arrayList);//Output - [pramod, pramod, dutta, true, 1.23, 123]
        System.out.println(arrayList.size()); //Output - 6
    }
}
