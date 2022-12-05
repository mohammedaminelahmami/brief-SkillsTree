package com.example.brief6.util;

public class SoutError {
    public static void print(String color, String error)
    {
        switch (color) {
            case "red" -> System.out.println("\u001B[31m" + error + "\u001B[0m");
            case "green" -> System.out.println("\u001B[32m" + error + "\u001B[0m");
            case "yellow" -> System.out.println("\u001B[33m" + error + "\u001B[0m");
            case "orange" -> System.out.println("\u001B[34m" + error + "\u001B[0m");
            default -> System.out.println(error);
        }
    }
}