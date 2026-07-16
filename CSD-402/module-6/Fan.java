/**
 * Title: Module 6.2 Programming Assignment
 * File: Fan.java
 * Description: A program that defines a Fan class with various properties 
 *              and displays its functionality using test instances.
 * Author: Anthony Garcia
 * Date: July 16, 2026
 */

public class Fan {
    // 1. Four constants holding the speed values
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // 2. Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * No-argument constructor that sets all fields to default values.
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    /**
     * Parameterized constructor that takes arguments to set specific values.
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // --- Getter and Setter Methods ---

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        // Ensure valid speed values
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed value.");
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a string description of the fan's state.
     */
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON: [Speed: " + speed + ", Color: " + color + ", Radius: " + radius + "]";
        } else {
            return "Fan is OFF: [Color: " + color + ", Radius: " + radius + "]";
        }
    }

    // --- Test Code (Main Method) ---
    public static void main(String[] args) {
        System.out.println("--- Testing Default Constructor (Fan 1) ---");
        // Create an instance using the default constructor
        Fan fan1 = new Fan();
        System.out.println("Initial State (Default): " + fan1.toString());
        
        // Demonstrate setter methods on the default fan
        fan1.setOn(true);
        fan1.setSpeed(MEDIUM);
        fan1.setColor("blue");
        fan1.setRadius(7.5);
        System.out.println("State after modifying properties: " + fan1.toString());

        System.out.println("\n--- Testing Argument Constructor (Fan 2) ---");
        // Create an instance using the argument constructor (Speed: FAST, On: true, Radius: 10, Color: yellow)
        Fan fan2 = new Fan(FAST, true, 10.0, "yellow");
        System.out.println("Initial State (Customized): " + fan2.toString());

        // Demonstrate turning the customized fan off
        fan2.setOn(false);
        System.out.println("State after turning fan off: " + fan2.toString());
    }
}