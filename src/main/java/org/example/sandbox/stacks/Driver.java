package org.example.sandbox.stacks;

public class Driver {

    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayListStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek()); // Should print 30
        System.out.println("Stack empty? " + stack.empty()); // Should print false

        System.out.println("Popped element: " + stack.pop()); // Should print 30
        System.out.println("Top element after pop: " + stack.peek()); // Should print 20

        System.out.println("Index of 10: " + stack.search(10)); // Should print 1
        System.out.println("Index of 30: " + stack.search(30)); // Should print -1 (not found)

        System.out.println(stack);

        stack.pop();
        stack.pop();

        System.out.println("Stack empty after popping all elements? " + stack.empty()); // Should print true

        System.out.println(stack);
    }
}
