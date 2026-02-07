package ex_30_Collection_Framework;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack(); //Stack means Last in first out

        Stack s = new Stack();
        s.add("Pramod");
        s.add("Dutta");
        s.add("Amit");
        System.out.println(s);//Output - [Pramod, Dutta, Amit]
        System.out.println(s.size());//Output - 3
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.pop());//Pop will remove the elements from the Top and print the rest elements
        System.out.println(s);

        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);

        System.out.println(s.get(0));//It will print the index value of 0 i.e Pramod
        System.out.println(s.get(1));//It will print the index value of 1 i.e Dutta

    }
}
//Output -
//[Pramod, Dutta, Amit]
//3
//[Pramod, Dutta, Amit]
//Amit
//[Pramod, Dutta, Amit]
//Amit
//[Pramod, Dutta]
//true
//[Pramod, Dutta, Snehal]
//[Pramod, Dutta, Snehal, Chetan, Chetan, Vijay]
//Pramod
//Dutta