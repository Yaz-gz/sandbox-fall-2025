package org.example.sandbox.lambda;

import java.util.List;
import java.util.function.*;

public class LambdaDemo {

    public static void main(String[] args) {
        // x -> x * 2
        // anonymous function

        // 4 classes
        // Predicate - takes 1 value return a boolean
        Predicate<String> predicate = s -> s.startsWith("a");

        // Function - take 1 value and return a value
        Function<Integer, Integer> function = x -> {
            x = 10;
            x = x + 5;
            return x * 2;
        };

        // Supplier - takes nothing returns 1 value
        Supplier<String> supplier = () -> "Hello World!";

        // Consumer - takes 1 value returns nothing
        Consumer<String> consumer = System.out::println;
        // method reference

        List<String> myList = List.of("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }


}
