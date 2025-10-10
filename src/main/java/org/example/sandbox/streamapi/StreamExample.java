package org.example.sandbox.streamapi;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamExample {

    public static void main(String[] args) {
        // Creating sample data, this is a list named numbers that contains
        // integers from 1 to 5, with 5 being duplicated.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 5);

        // A list of strings named names containing some Java-related terms.
        // You can modify these lists to use name with whatever you want.
        // We are using this list that starts wth uppercase and different letters to show
        // different streams operations.
        List<String> names = List.of("Reflection", "Collection", "Stream", "Java");

        // Creating a Lambda expression that checks if a number is even.
        // This is called an int predicate, which is a functional interface that takes
        // an int input and returns a boolean. Predicates return a bloolean value.
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        // The following are Stream intermediate operations

        // map;
        List<Integer> square = numbers // Creating a new list named square that is identical to the numbers list
                .stream() // stream() is a method that converts a collection (list,sets,maps) into a stream
                .map(x -> x * x) // (considered a monad) map() is a method that takes a function as an argument and applies it to each element of the stream
                                        // in this case, we are squaring each number in the stream
                .toList(); // terminal operation. toList() is a method that converts the stream back into a list
        square.forEach(System.out::println);

        // filter
        List<String> result = names // Creating a new list named result that contains the same elements as the names list
                .stream()
                .filter(s -> s.startsWith("S")) // filter() is a method that takes a predicate as an argument and applies it to each element of the stream
                                        // in this case, we are filtering the names that start with the letter "S"
                                        // the result will be a stream that contains only the names that start with "S", filtering only returns the values that
                                        // match the predicate. We could also use the evenOnlyPredicate here if we had a list of integers.
                .toList();
        result.forEach(System.out::println);

        // sorted
        List<String> result2 = names
                .stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .toList();
        result2.forEach(System.out::println);

        // terminal operations

        // collect
        Set<String> squared = numbers.stream()
                .map(x -> x * x)
                .map(String::valueOf)
                .collect(Collectors.toSet());
        squared.forEach(System.out::println);

        // foreach
        numbers.stream()
                .map(x -> x * x)
                .forEach(System.out::println);
        numbers.forEach(System.out::println);

        // reduce
        int sum = 0;
        for(int x = 1; x <= 5; x++) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println("Even sum: " + sum);

        int evenSum = numbers.stream()
                .filter(evenOnlyPredicate)
                .reduce(0, (acc, x) -> acc + x);
        System.out.println("Even sum: " + evenSum);

        // int streams
        int totalSum = IntStream.iterate(0, x -> x + 1)
                .skip(5)
                .limit(5)
                .filter(evenOnly)
                .reduce(2, Integer::sum);
        System.out.println("Total sum: " + totalSum);

        // random ints
        Random random = new Random();
        random.ints(1, 11)
                .limit(50)
                .forEach(System.out::println);

        // steam of random strings
        String randomString = Stream.generate(new StringGenerator())
                .limit(64)
                .collect(Collectors.joining());
        System.out.println(randomString);

    }
}
