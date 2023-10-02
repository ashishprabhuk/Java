package DataStructures;

import java.util.Stack;

/*  
 * A Stack in Java is a data structure that follows the Last-In-First-Out (LIFO) principle,
 *  where the last element added is the first one to be removed. 
 */

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the Stack
        System.out.println("Stack: " + stack);

        // Peek at the top element (without removing it)
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop elements from the Stack
        int poppedElement1 = stack.pop();
        int poppedElement2 = stack.pop();

        // Display the popped elements
        System.out.println("Popped element 1: " + poppedElement1);
        System.out.println("Popped element 2: " + poppedElement2);

        // Check if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack empty? " + isEmpty);

        // Display the size of the Stack
        int size = stack.size();
        System.out.println("Size of Stack: " + size);
    }
}
