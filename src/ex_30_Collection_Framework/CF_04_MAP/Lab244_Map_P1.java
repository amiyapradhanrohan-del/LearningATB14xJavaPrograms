package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_Map_P1 {
    public static void main(String[] args) {
     //   Map m1 = new Map(); - We can not create an object of the Map., it is an interface

//        Map m1 = new HashMap();
//        //The function used in HashMap is "put"
//        m1.put("name","pramod");
//        m1.put("rollno","pramod");
//        m1.put(true,"prampd");
//        m1.put(3.14,"pramod");

        //Lets create a new HashMap() having the following data
        Map m1 = new HashMap();

        //Map is key - value
        //name : pramod,
        //rollno : 1
        //phone : 8598803179
        m1.put("name","pramod");
        m1.put("rollno",1);
        m1.put("phone",859880317);
        System.out.println(m1);
        //Output - {phone=859880317, name=pramod, rollno=1} - Keys are randomly added

        //By taking LinkedHashMap()
        Map m2 = new LinkedHashMap();
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",859880317);
        System.out.println(m2);
        //Output - {name=pramod, rollno=1, phone=859880317} - Keys are in a proper order

        //By taking TreeMap()
        Map m3 = new TreeMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 859880317
        m3.put("name","pramod");
        m3.put("rollno",1);
        m3.put("phone",859880317);
        System.out.println(m3);
        //Output - {name=pramod, phone=859880317, rollno=1} - Sorted based on natural ordering


    }
}
