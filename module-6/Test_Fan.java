// JOSE VELAZQUEZ
// MODULE 6.2 ASSIGNMENT 
// DATE: 02/02/2026
// THIS IS THE TEST_FAN CLASS TO TEST THE FAN CLASS


public class Test_Fan {

    public static void main(String[] args) {

        // Fan created using no argument constructor
        Fan fan1 = new Fan();

        // Fan created using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // Display default fan
        System.out.println("Fan 1 (Default Constructor):");
        System.out.println(fan1);
        System.out.println();

        // Display customized fan
        System.out.println("Fan 2 (Argument Constructor):");
        System.out.println(fan2);
        System.out.println();

        // Setter methods to modify fan1
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("red");
        fan1.setRadius(8);

        System.out.println("Fan 1 After Using Setters:");
        System.out.println(fan1);
    }
}

