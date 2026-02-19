// JOSE VELAZQUEZ
// MODULE 8.2 ASSIGNMENT 
// DATE: 02/19/2026
// This program defines a method to find the largest integer in 
// an ArrayList and tests it with user input.
// The max method takes an ArrayList as input and returns the largest integer. 
// If the list is empty, it returns 0.


import java.util.ArrayList;
import java.util.Scanner;

public class JoseArrayListTest {

    // Method to find the largest integer in an ArrayList
    public static Integer max(ArrayList list) {

        // If list is empty, return 0
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        // Loop through list to find max value
        for (Object obj : list) {
            Integer value = (Integer) obj;

            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }

    // Test Code
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (Enter 0 to stop):");

        while (true) {
            int value = input.nextInt();
            numbers.add(value);

            if (value == 0) {
                break;
            }
        }

        // Send ArrayList to max method
        Integer result = max(numbers);

        // Display results
        System.out.println("\nNumbers Entered: " + numbers);
        System.out.println("Largest Value: " + result);

        input.close();
    }
}
