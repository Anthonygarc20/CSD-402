/**
 * Abstract class representing a company division.
 * Author: Anthony Garcia
 * Date: August 11, 2026
 * Course: CSD402
 */
public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Superclass constructor requiring values for both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract display method to be implemented by concrete subclasses
    public abstract void display();
}