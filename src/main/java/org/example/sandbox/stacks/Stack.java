package org.example.sandbox.stacks;

public interface Stack<E> {

    boolean empty();
    E peek();
    E pop();
    void push(E item);       // void = return type, which means this method does not return a value
                             // push = method name, (in stack data structures) add an element to the top
                             // (E item) = parameter list. Takes 1 parameter named item of type E. E could be anytime
    int search(E element);
}
