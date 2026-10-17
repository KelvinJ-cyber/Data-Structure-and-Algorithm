package DataStructures;

import java.util.LinkedList;

public class LinkedList_s {

    public static void main(String[] args) {

       // LinkedList is a data structure used to store a collection of elements called nodes. Each node contains data and a reference to another node.

       // ------------Types (Singly and Doubly)

       // A singly linked list allows you to move in one direction, from the first node to the last
        // A doubly linked list allows you to move both forward and backward.


        // you can treat your linked list as a stack or a queue

        LinkedList<String> linkedList = new LinkedList<String>();

     /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();

       */
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();

        linkedList.add(4,"E");
        linkedList.remove("E");


        System.out.println(linkedList);
    }
}
