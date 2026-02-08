package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.*;

public class Lab237_AL_iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");
        System.out.println(" - To Print Arraylist - 1 ");//Output -  - To Print Arraylist - 1

        //To print the mylist we can use the for loop, for which loop or Iterator
        for (String str : mylist){ //for which loop
            System.out.println(str);
            //Output -
            //Pramod
            //Amit
            //Dutta
        }
        System.out.println(" - To Print Arraylist - 2 ");

        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //Output -
            //Pramod
            //Amit
            //Dutta
        }
        System.out.println(" - To Print Arraylist - 3 ");

        for (int i =0; i<mylist.size(); i++){ //Normal for loop
            System.out.println(mylist.get(i));
            //Output - - To Print Arraylist - 3
            //Pramod
            //Amit
            //Dutta
        }
    }
}
