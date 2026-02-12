// JOSE VELAZQUEZ
// MODULE 7.2 ASSIGNMENT 
// DATE: 02/11/2026
// This class represents a Fan with properties such as speed, on/off status, radius, and color.
// It includes constants for speed settings, constructors, getters, setters, and an optional toString method for display purposes.
// The UseFans class demonstrates how to create and display multiple Fan instances without relying on the toString method, instead using explicit display methods to show each property of the fans.


import java.util.ArrayList;
import java.util.Collection;

public class UseFans {

    // Display a Single Fan
    public static void displayFan(Fan fan) {
        System.out.println("Fan State:");
        System.out.println("On: " + fan.isOn());
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    // Display a Collection of Fans
    public static void displayFans(Collection<Fan> fans) {
        int count = 1;
        for (Fan fan : fans) {
            System.out.println("\n---- Fan #" + count + " ----");
            displayFan(fan);
            count++;
        }
    }

    // Test Code to Create and Display Fans
    public static void main(String[] args) {

        // Create a collection of Fan instances
        ArrayList<Fan> fanCollection = new ArrayList<>();

        // Fan using default constructor
        Fan fan1 = new Fan();

        // Fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // Add more fans to demonstrate a collection
        Fan fan3 = new Fan(Fan.SLOW, true, 7.5, "black");
        Fan fan4 = new Fan(Fan.STOPPED, false, 12, "silver");

        // Modify one fan using setters to show functionality
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("red");

        // Add all fans to the collection
        fanCollection.add(fan1);
        fanCollection.add(fan2);
        fanCollection.add(fan3);
        fanCollection.add(fan4);

        // Display all fans in the collection (NO toString)
        System.out.println("Displaying Fan Collection:");
        displayFans(fanCollection);
    }
}
