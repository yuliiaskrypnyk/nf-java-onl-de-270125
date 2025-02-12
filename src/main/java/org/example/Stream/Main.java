package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers = Arrays.asList(10, 7, 9, 4, 5, 1, 6, 8, 3, 2);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .sorted()
                .forEach(System.out::println);
                //.forEach(number -> System.out.println(number));

        int result = numbers.stream()
                //.reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);

        System.out.println("sum: " + result);

        List<Integer> numberList = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(numberList);
    }
}
