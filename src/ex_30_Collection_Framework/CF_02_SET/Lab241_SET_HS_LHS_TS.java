package ex_30_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab241_SET_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        //When the HashSet is used ?
        //It is basically used in Hashing mechanism to store the elements in a no order and no duplicate format also

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        //hs.add(123); //we can not add a diff data structure in between because we have taken String
        hs.add(null); //One null is allowed in HashSet
        System.out.println(hs);
        //Output - [null, Apple, WaterMelon, Orange] - Here order is not maintained
        //Here the duplicate is removed

        System.out.println(" ----------------------------------------- ");
        //"LinkedHashSet" is a set, it is mechanism to store the elements in an Order.
        //Here Order will be maintained, no duplicates

        Set lhs = new LinkedHashSet();
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());
        //Output -
        //-----------------------------------------
        ////[Dpple, apple, Orange, WaterMelon, null]
        ////false
        ////false
        ////5

        System.out.println(" ----------------------------------------- ");
        //Black and Red Tree mechanism is used to store the elements
        //Here Order will be maintained, but Natural sorting is done

        Set ts = new TreeSet();
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
     //   ts.add(null); // java.lang.NullPointerException
        // ts.add(123); // java.lang.ClassCastException
        System.out.println(ts);
        //Output -
        //-----------------------------------------
        //[Apple, Dapple, Orange, WaterMelon]

    }
}
