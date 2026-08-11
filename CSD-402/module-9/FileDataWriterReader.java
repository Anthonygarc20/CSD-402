import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Program 2: Creates/appends 10 random integers to data.file,
 * closes the file, reopens it, and reads/displays the contents.
 * Author: Anthony Garcia
 * Course: CSD 402
 */
public class FileDataWriterReader {

    public static void main(String[] args) {
        String fileName = "data.file";
        File file = new File(fileName);
        Random random = new Random();

        // 1. Write/Append 10 random integers to data.file
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            System.out.println("Writing 10 random integers to " + fileName + "...");
            for (int i = 0; i < 10; i++) {
                int randomNum = random.nextInt(100); // Random integer between 0 and 99
                writer.print(randomNum + " ");
            }
            writer.println(); // Add new line at end of batch
            System.out.println("Data successfully written and file closed.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // 2. Reopen file, read, and display data
        System.out.println("\n=== Reading contents from " + fileName + " ===");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext()) {
                System.out.print(fileScanner.next() + " ");
            }
            System.out.println("\n\nFile reading completed.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

