import java.util.Scanner;

/**
 * CSD402-T301 Java for Programmers
 * Module 1.3 Programming Assignment
 * Description: Calculates the energy needed to heat water in Joules.
 */
public class CalculateEnergy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("       Water Energy Requirement Calculator       ");
        System.out.println("=================================================");

        // 1. Prompt user for water mass in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // 2. Prompt user for initial temperature
        System.out.print("Enter the initial temperature of the water (Celsius): ");
        double initialTemperature = input.nextDouble();

        // 3. Prompt user for final temperature
        System.out.print("Enter the final temperature of the water (Celsius): ");
        double finalTemperature = input.nextDouble();

        // 4. Calculate energy using formula: Q = waterMass * (finalTemperature - initialTemperature) * 4184
        double totalJoules = waterMass * (finalTemperature - initialTemperature) * 4184;

        // 5. Display results
        System.out.println("\n-------------------------------------------------");
        System.out.printf("The energy needed to heat %.2f kg of water%n", waterMass);
        System.out.printf("from %.2f°C to %.2f°C is: %,.2f Joules.%n", initialTemperature, finalTemperature, totalJoules);
        System.out.println("=================================================");

        input.close();
    }
}