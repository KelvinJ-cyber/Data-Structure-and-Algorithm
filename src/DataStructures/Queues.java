package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    // Queues is a FIFO data structure. First in First out (ex. A line of people)
    //             A collection designed for holding elements prior to processing
    //             Linear Data Structure
    //
    //             add = enqueue, offer(). It is used to add an element to the end/tail of the queue.
    //             remove = dequeue, poll(). It is used to remove an element from the front/head of the queue.


    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Kelvin");
        queue.offer("Steve");
        queue.offer("Justin");
        queue.offer("Ken");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Steve"));

        System.out.println(queue.peek()); // returns the head of the queue without removing it
        System.out.println(queue.poll()); // returns and removes the head of the queue
        System.out.println(queue);

        // where are Queues useful?

        // 1. Keyboard Buffers( letter should appear in the order they are pressed )
        // 2. Printer Queue (Print jobs should be completed in order)


    }



}
