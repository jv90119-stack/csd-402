// JOSE VELAZQUEZ
// MODULE 7.2 ASSIGNMENT 
// DATE: 02/11/2026
// This class represents a Fan with properties such as speed, on/off status, radius, and color.
// It includes constants for speed settings, constructors, getters, setters, and an optional toString method for display purposes.
// The UseFans class demonstrates how to create and display multiple Fan instances without relying on the toString method, instead using explicit display methods to show each property of the fans.


public class Fan {

    // Constants 
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields 
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-Argument Constructor 
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Argument Constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    // Keep toString() (still useful), but UseFans will NOT use it.
    @Override
    public String toString() {
        if (this.on) {
            return """
                    Fan is ON
                    Speed: %s
                    Color: %s
                    Radius: %s
                    """.formatted(this.speed, this.color, this.radius);
        } else {
            return """
                    Fan is OFF
                    Color: %s
                    Radius: %s
                    """.formatted(this.color, this.radius);
        }
    }
}
