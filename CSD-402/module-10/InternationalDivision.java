/**
 * Subclass representing an international division.
 * Author: Anthony Garcia
 * Date: August 11, 2026
 * Course: CSD402
 */
public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor requiring all fields
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("--- International Division ---");
        System.out.println("Division Name : " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country       : " + country);
        System.out.println("Language      : " + language);
        System.out.println();
    }
}
