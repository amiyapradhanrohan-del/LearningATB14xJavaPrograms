package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab247_Map_Iterate {
    public static void main(String[] args) {
        //For MAP "Iterate" does not exist.
        Map<String,Integer> map = new HashMap<>();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 100);

        System.out.println(map); //{null=100, id2=2, id4=null, id3=34, id=1, id5=null}
        System.out.println(map.size());// 6

        //I have to remember this loop
        for(Map.Entry<String,Integer> item : map.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue());
            //Output -
            //null -> 100
            //id2 -> 2
            //id4 -> null
            //id3 -> 34
            //id -> 1
            //id5 -> null
        }

    }
}
