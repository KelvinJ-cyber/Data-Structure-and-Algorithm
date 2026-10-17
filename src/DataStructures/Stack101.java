package DataStructures;

import java.util.Stack;

public class Stack101 {

    public static void main(String[] args) {

        // DataStructure.Stack101 is a LIFO (Last In First Out) data structure. Stores  objects into a sort of "vertical tower" where push()
        // adds an element to the top of the stack, and pop() removes the top element peek() returns the top element without removing it.
        // It can be implemented using arrays or linked lists. Here, we will implement a stack using an array.

        Stack<String> stack = new Stack<String>();

        stack.push("Forza Horizon");
        stack.push("Assassin's creed");
        stack.push("FIFA 2024");
        stack.push("God of War");


        String myFavGame = stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack.search("Assassin's creed"));

        System.out.println(myFavGame);
        System.out.println(stack);

//        for (int i = 0; i<= 1000000000; i++  ){
//            stack.push("TLOU II");
//        }


        // Uses of Stack ?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)






    }
}
