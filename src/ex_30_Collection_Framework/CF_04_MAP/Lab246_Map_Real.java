package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Lab246_Map_Real {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap<>();
        student1.put("name","Diwakar");
        student1.put("phone","859880317");
        student1.put("address","BLR");
        student1.put("home_address","BTM");

        System.out.println(student1);
        //Output - {address=BLR, home_address=BTM, phone=859880317, name=Diwakar}

        Map<String,Object> student2 = new LinkedHashMap<>();
        student2.put("name","Diksha");
        student2.put("phone","890765432");
        student2.put("address","DEL");
        student2.put("home_address","RG");

        System.out.println(student2);
        //Output - {name=Diksha, phone=890765432, address=DEL, home_address=RG}

    }
}
//HashMap - It will print the value in a random order.
//LinkedHashMap - It will print the value in a sequence.
//Map method has Key, Set method only contains values.