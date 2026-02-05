package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab229_List {
    public static void main(String[] args) {
        // List s = new List() - List is an interface, we can not create an object for this

        //with father reference child object is possible because of runtime polymorphism, because of dynamic dispatch
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); //by default the default capacity is 10 for the arraylist

    }
}
