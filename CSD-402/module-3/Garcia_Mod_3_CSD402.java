/**
 * Name: Garcia Anthony
 * Course: CSD402
 * Module: 3.2
 * Description: Program that uses nested for loops to output a number pyramid 
 *              of powers of 2 with a trailing '@' symbol on each line.
 */

public class Garcia_Mod_3_CSD402 {
    public static void main(String[] args) {
        int rows = 7; // Total number of rows in the pyramid

        for (int i = 0; i < rows; i++) {
            // 1. Print leading spaces for alignment
            // Each column is 3 characters wide ("%3s" or "%3d")
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("   ");
            }

            // 2. Print increasing powers of 2 (from 1 up to 2^i)
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d", (int) Math.pow(2, j));
            }

            // 3. Print decreasing powers of 2 (from 2^(i-1) down to 1)
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%3d", (int) Math.pow(2, j));
            }

            // 4. Print the trailing '@' symbol and move to the next line
            System.out.println(" @");
        }
    }
}