package org.example.ProductRepo;

public class CLI {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public void printSuccess(String message) {
        System.out.println(ANSI_GREEN + message + ANSI_RESET);
    }

    public void printError(String message) {
        System.out.println(ANSI_RED + message + ANSI_RESET);
    }

    public void printInfo(String message) {
        System.out.println(ANSI_BLUE + message + ANSI_RESET);
    }
}