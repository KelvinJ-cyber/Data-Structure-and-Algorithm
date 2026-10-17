package DataStructures;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioritiesQueues {


    public static void main(String[] args) {

        // Priority Queue is a data structure(FIFO) that stores elements with associated priorities.
        // Elements are removed from the queue based on their priority, with higher priority elements being removed first.


        Queue<Double> queue = new PriorityQueue<Double>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }




    }
}
