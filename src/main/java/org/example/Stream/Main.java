package org.example.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        Path filePath = Path.of("students.csv");

        try {
            Files.lines(filePath)
                    .skip(1)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(filePath)) {
            List<Student> students = lines
                    .skip(1)
                    .filter(line -> !line.isBlank())
                    .map(line -> {
                        String[] parts = line.split(",");
                        int id = Integer.parseInt(parts[0].trim());
                        String name = parts[1].trim();
                        int postalCode = Integer.parseInt(parts[2].trim());
                        int age = Integer.parseInt(parts[3].trim());
                        return new Student(id, name, postalCode, age);
                    })
                    .distinct()
                    .toList();

            students.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
