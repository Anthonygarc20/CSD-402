import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program 1: Demonstrates ArrayList iteration, autoboxing/auto-unboxing,
 * and exception handling with try/catch for index bounds.
 * Author: Anthony Garcia
 * Course: CSD 402
 */
public class ArrayListExceptionTest {

    public static void main(String[] args) {
        // Create and populate ArrayList with at least 10 String elements
        ArrayList<String> elements = new ArrayList<>();
        elements.add("0 - Java");
        elements.add("1 - Python");
        elements.add("2 - C++");
        elements.add("3 - JavaScript");
        elements.add("4 - HTML");
        elements.add("5 - CSS");
        elements.add("6 - SQL");
        elements.add("7 - Swift");
        elements.add("8 - Kotlin");
        elements.add("9 - Rust");

        // Print collection using a 'for-each' loop
        System.out.println("=== Element Collection ===");
        for (String item : elements) {
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-9) of the element you would like to see again: ");
        String userInput = scanner.nextLine();

        // Demonstrating Autoboxing/Auto-Unboxing:
        // Integer.valueOf(userInput) returns an Integer object (Autoboxing String -> Integer wrapper).
        // Assigning or unboxing into primitive int index (Auto-Unboxing).
        try {
            Integer wrapperIndex = Integer.valueOf(userInput); // Wrapper object creation
            int index = wrapperIndex;                          // Auto-unboxing to primitive int

            // Print element at chosen index
            System.out.println("Selected Element: " + elements.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Exception thrown: Invalid numerical input");
        } finally {
            scanner.close();
        }
    }
}
