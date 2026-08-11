/*
 * Program Name: AnthonyArrayListTest.java
 * Author: Anthony Garcia
 * Course: CSD-402
 * Module: Module 8.2
 * Description: Program that reads integers from user input into an ArrayList 
 *              until 0 is entered, and determines the maximum value.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnthonyArrayListTest {

    /**
     * Method that returns the largest value in an ArrayList of Integers.
     * Returns 0 if the list is null or empty.
     * 
     * @param list ArrayList of Integer objects
     * @param list The maximum value, or 0 if empty/null
     */
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("=== ArrayList Max Value Finder ===");
        System.out.println("Enter integers one by one (enter 0 to stop):");

        while (true) {
            System.out.print("Enter an integer: ");
            if (input.hasNextInt()) {
                int number = input.nextInt();
                numbers.add(number);
                if (number == 0) {
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); // Clear invalid input
            }
        }

        // Display user input
        System.out.println("\nYour entered list: " + numbers);

        // Find and display the maximum value
        Integer maxValue = max(numbers);
        System.out.println("The largest value in the ArrayList is: " + maxValue);

        // --- Additional Testing ---
        System.out.println("\n--- Testing Edge Cases ---");
        
        // Test Case 1: Empty List
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Max of empty list: " + max(emptyList) + " (Expected: 0)");

        // Test Case 2: List with negative numbers and zero
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(-10);
        testList.add(-5);
        testList.add(0);
        System.out.println("Max of test list " + testList + ": " + max(testList) + " (Expected: 0)");

        input.close();
    }
}