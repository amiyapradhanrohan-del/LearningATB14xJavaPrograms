package ex_30_Collection_Framework.CF_04_MAP;

import java.util.Hashtable;

public class Lab249_HashTable {//HashTable does not allow null value
    public static void main(String[] args) {
        // Map is Key, Value pair -> null values allows
        // Hashtable -> Synchronised(we are not going to use), Slow and Legacy Class - Thread Safe
        //T1, T2 - they will use one by one

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1, "One");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht1.put(4, null);
        //Hashtable does not allow null values, does not allow null key and it is Thread safe
        //HashMap allow null values, allow null key and also not Thread safe
    }
}
