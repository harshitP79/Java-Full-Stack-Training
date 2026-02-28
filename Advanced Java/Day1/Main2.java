
/*
1.Write a Java program using Stream API to:
Store integers in a list
Filter and display only even numbers

2.Write a Java program using Stream API to:
Store names in a list
Convert all names to uppercase
Display the result

3.Write a Java program using Stream API to:
Store integers in a list
Count how many numbers are greater than 50
*/

import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 60, 75, 90);
        System.out.println("Even Numbers:");
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        System.out.println("\nNames in Uppercase:");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        long countGreaterThan50 = numbers.stream()
                .filter(num -> num > 50)
                .count();
        System.out.println("\nCount of numbers greater than 50: " + countGreaterThan50);

        
    }
}
