package org.example.sandbox.collections;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");
        numbers.put(5, "One");
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(5));
        System.out.println(numbers.remove(5));
        System.out.println(numbers.get(5));

    }
}
