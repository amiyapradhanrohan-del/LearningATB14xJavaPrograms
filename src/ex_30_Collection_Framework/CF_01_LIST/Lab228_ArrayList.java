package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab228_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("1"); //string
        list.add("2");
        list.add("3");
        list.add("3"); //duplicates are allowed in ArrayList
        list.add(4); //Integer
        list.add(true); //boolean

        System.out.println(list.size()); //Output - 6
        System.out.println(list.isEmpty()); //Output - false
        System.out.println(list.contains("1")); //Output - true
        System.out.println(list.contains(1)); //Output - false
        System.out.println(list.indexOf("3")); //Output - 2
        System.out.println(list.lastIndexOf("3")); //Output - 3

        System.out.println(list); //we can print the list by direct calling the list
        //Output - [1, 2, 3, 3, 4, true]

        //I want to go one by one item, we can use for loop
        System.out.println(" --- "); //Output ---
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
            //Output -
            //1
            //2
            //3
            //3
            //4
            //true
        }

        //We can use for each loop
        System.out.println(" --- "); //Output ---
        for (Object o:list){ //we are using Object because we have multiple data types
            System.out.println(o);
            //Output -
            //1
            //2
            //3
            //3
            //4
            //true
        }

        //We can use iterator to print the list
        System.out.println(" ----- "); //Output -----
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //Output -
            //1
            //2
            //3
            //3
            //4
            //true
        }

    }
}
