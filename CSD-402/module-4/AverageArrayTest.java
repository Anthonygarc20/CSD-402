/**
 * Assignment: Module 4.2 Programming Assignment
 * Name: Garcia Anthony
 * Course: CSD402 Java for Programmers
 * Description: This program demonstrates method overloading by calculating 
 *              the average of four different numeric array types (short, int, 
 *              long, and double), each with different array sizes.
 */

import java.util.Arrays;

public class AverageArrayTest {

    // 1. Overloaded method for short array
    public static short average(short[] array) {
        if (array == null || array.length == 0) return 0;
        long sum = 0; // Use a larger type to prevent overflow during summation
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // 2. Overloaded method for int array
    public static int average(int[] array) {
        if (array == null || array.length == 0) return 0;
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // 3. Overloaded method for long array
    public static long average(long[] array) {
        if (array == null || array.length == 0) return 0;
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // 4. Overloaded method for double array
    public static double average(double[] array) {
        if (array == null || array.length == 0) return 0.0;
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    /**
     * Test program to invoke each overloaded method and display results.
     */
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      Array Averaging Overload Test Program       ");
        System.out.println("==================================================\n");

        // Test Case 1: short array (Size 4)
        short[] shortArray = {10, 20, 30, 40};
        System.out.println("--- Short Array (Size: " + shortArray.length + ") ---");
        System.out.println("Elements: " + Arrays.toString(shortArray));
        System.out.println("Calculated Average: " + average(shortArray) + "\n");

        // Test Case 2: int array (Size 5)
        int[] intArray = {100, 250, 400, 550, 700};
        System.out.println("--- Integer Array (Size: " + intArray.length + ") ---");
        System.out.println("Elements: " + Arrays.toString(intArray));
        System.out.println("Calculated Average: " + average(intArray) + "\n");

        // Test Case 3: long array (Size 3)
        long[] longArray = {100000L, 200000L, 600000L};
        System.out.println("--- Long Array (Size: " + longArray.length + ") ---");
        System.out.println("Elements: " + Arrays.toString(longArray));
        System.out.println("Calculated Average: " + average(longArray) + "\n");

        // Test Case 4: double array (Size 6)
        double[] doubleArray = {1.5, 2.5, 3.75, 4.25, 5.0, 6.5};
        System.out.println("--- Double Array (Size: " + doubleArray.length + ") ---");
        System.out.println("Elements: " + Arrays.toString(doubleArray));
        System.out.printf("Calculated Average: %.4f\n\n", average(doubleArray));

        System.out.println("==================================================");
    }
}