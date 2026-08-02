/**
 * Title: Module 7.2 Programming Assignment
 * File: UseFans.java
 * Description: Creates a collection of Fan instances and demonstrates display methods 
 *              without relying on the toString() method.
 * Author: Anthony Garcia
 * Date: July 23, 2026
 */

import java.util.ArrayList;
import java.util.Collection;

public class UseFans {

    /**
     * Displays details for a single Fan instance without using toString().
     *
     * @param fan The Fan instance to display
     */
    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan Status: ON");
            System.out.println("  - Speed : " + fan.getSpeed());
            System.out.println("  - Color : " + fan.getColor());
            System.out.println("  - Radius: " + fan.getRadius());
        } else {
            System.out.println("Fan Status: OFF");
            System.out.println("  - Color : " + fan.getColor());
            System.out.println("  - Radius: " + fan.getRadius());
        }
    }

    /**
     * Displays details for a collection of Fan instances without using toString().
     *
     * @param fans Collection of Fan instances to display
     */
    public static void displayFanCollection(Collection<Fan> fans) {
        int index = 1;
        for (Fan fan : fans) {
            System.out.println("--- Fan #" + index + " ---");
            displayFan(fan);
            System.out.println();
            index++;
        }
    }

    /**
     * Test code demonstrating functionality.
     */
    public static void main(String[] args) {
        // Create a collection of Fan instances
        Collection<Fan> fanList = new ArrayList<>();

        // Add several Fan instances to the collection
        fanList.add(new Fan()); // Default fan
        fanList.add(new Fan(Fan.FAST, true, 10.0, "yellow"));
        fanList.add(new Fan(Fan.MEDIUM, true, 8.5, "blue"));
        fanList.add(new Fan(Fan.SLOW, false, 5.0, "black"));

        // Display the collection using displayFanCollection
        System.out.println("==========================================");
        System.out.println("  DISPLAYING ALL FANS IN COLLECTION");
        System.out.println("==========================================\n");
        displayFanCollection(fanList);

        // Demonstrate single instance display method directly
        System.out.println("==========================================");
        System.out.println("  TESTING SINGLE FAN DISPLAY METHOD");
        System.out.println("==========================================");
        Fan singleFan = new Fan(Fan.FAST, true, 12.0, "red");
        displayFan(singleFan);
    }
}