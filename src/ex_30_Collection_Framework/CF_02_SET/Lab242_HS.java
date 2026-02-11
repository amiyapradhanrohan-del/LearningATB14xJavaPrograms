package ex_30_Collection_Framework.CF_02_SET;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab242_HS {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(9);
        set.add(3);
        set.add(1);
        System.out.println("Set elements: " + set); //Output - Set elements: [1, 3, 9]

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //Output -
            //1
            //3
            //9

        }
    }
}
//Output - Set elements: [1, 3, 9]
//In TreeSet it will follow the Order while printing. automatically sorting will be done