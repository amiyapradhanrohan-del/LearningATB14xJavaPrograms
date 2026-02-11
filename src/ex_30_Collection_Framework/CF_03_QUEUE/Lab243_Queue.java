package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.PriorityQueue;

public class Lab243_Queue {
    // Queue -> 0.001% used in Automation
    // FIFO
    public static void main(String[] args) {
        //In Queue , we add the elements based on the natural sorting they will sort the elements

        PriorityQueue q = new PriorityQueue<>();
        q.add("Pramod");
        q.add("Dutta");
        System.out.println(q);// natural sorting

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
//Output -
//[Dutta, Pramod]
//Dutta
//[Dutta, Pramod]
//Dutta
//[Pramod]