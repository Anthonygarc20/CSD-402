/**
 * Main application class instantiating 2 International and 2 Domestic divisions.
 * Author: Anthony Garcia
 * Date: August 11, 2026
 * Course: CSD402
 */
public class UseDivision {
    public static void main(String[] args) {
        // Instantiate two InternationalDivision objects
        InternationalDivision intDiv1 = new InternationalDivision("EMEA Operations", 1001, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("APAC Logistics", 1002, "Japan", "Japanese");

        // Instantiate two DomesticDivision objects
        DomesticDivision domDiv1 = new DomesticDivision("Southwest Regional", 2001, "Texas");
        DomesticDivision domDiv2 = new DomesticDivision("Midwest Distribution", 2002, "Illinois");

        // Display details for all 4 instances
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}