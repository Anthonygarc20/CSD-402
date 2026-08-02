/**
 * Title: Module 7.2 Programming Assignment
 * File: Fan.java
 * Description: Defines a Fan class using 'this' references throughout.
 * Author: Anthony Garcia
 * Date: July 23, 2026
 */

public class Fan {
    // Four constants holding speed values
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * No-argument constructor using default values.
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    /**
     * Parameterized constructor using 'this' references for all fields.
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.setSpeed(speed);
        this.setOn(on);
        this.setRadius(radius);
        this.setColor(color);
    }

    // --- Getter and Setter Methods using 'this' ---

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed value.");
        }
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a string description of the fan's state.
     */
    @Override
    public String toString() {
        if (this.isOn()) {
            return "Fan is ON: [Speed: " + this.getSpeed() + ", Color: " + this.getColor() + ", Radius: " + this.getRadius() + "]";
        } else {
            return "Fan is OFF: [Color: " + this.getColor() + ", Radius: " + this.getRadius() + "]";
        }
    }
}