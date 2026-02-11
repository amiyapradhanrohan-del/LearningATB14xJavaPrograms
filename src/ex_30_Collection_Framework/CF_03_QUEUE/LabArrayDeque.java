package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class LabArrayDeque {
    public static void main(String[] args) {
        //In ArrayDeque we can push the elements

        Deque<Integer> deck = new ArrayDeque<>();
        deck.push(5);
        deck.push(1);
        System.out.println(deck);//Here who will come first, it will be available first
    }
}
//Output - [1, 5]
