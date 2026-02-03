// JOSE VELAZQUEZ
// MODULE 6.2 ASSIGNMENT 
// DATE: 02/02/2026
// THIS IS THE FAN CLASS DEFINING A FAN OBJECT WITH PROPERTIES AND BEHAVIORS. 


public class Fan {

    // Constants defining fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields representing fan properties
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-Argument Constructor defaulting to specified values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Argument Constructor defining all properties
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters for all fields
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    // toString Method to display fan status
    @Override
    public String toString() {
        if (on) {
            return """
                   Fan is ON
                   Speed: """ + speed +
                   "\nColor: " + color +
                   "\nRadius: " + radius;
        } else {
            return """
                   Fan is OFF
                   Color: """ + color +
                   "\nRadius: " + radius;
        }
    }
}