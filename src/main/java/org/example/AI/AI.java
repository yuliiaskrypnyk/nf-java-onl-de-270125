package org.example.AI;

import java.util.ArrayList;
import java.util.List;

public class AI {
    public static void main(String[] args) {
        // Reverse the string "Hello" and print the result
        System.out.println(reverseString("Hello")); // "olleH"

        // Check if "anna" is a palindrome and print the result
        System.out.println(isPalindrome("anna")); // true
        // Check if "hello" is a palindrome and print the result
        System.out.println(isPalindrome("hello")); // false

        // Generate and print the first 10 prime numbers
        System.out.println(generatePrimes(10)); // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
    }

    // Method to reverse a given string
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        // Reverse the string and compare with original (case-insensitive)
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    // Method to generate a list of the first n prime numbers
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        // Keep checking numbers until we've found 'n' prime numbers
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num); // Add the prime number to the list
            }
            num++;
        }
        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        // Numbers less than 2 are not prime
        if (num < 2) return false;
        // Check divisibility up to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; // If divisible, it's not prime
        }
        return true;
    }
}