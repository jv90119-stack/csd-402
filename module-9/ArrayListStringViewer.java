// JOSE VELAZQUEZ
// MODULE 9.2 ASSIGNMENT 
// DATE: 02/25/2026
// This program demonstrates the use of an ArrayList to store strings,
// and includes exception handling for user input.


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStringViewer {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        // Minimum 10 strings
        items.add("Alpha");
        items.add("Bravo");
        items.add("Charlie");
        items.add("Delta");
        items.add("Echo");
        items.add("Foxtrot");
        items.add("Golf");
        items.add("Hotel");
        items.add("India");
        items.add("Juliet");

        // Print collection using for-each loop
        System.out.println("ArrayList contents:");
        for (String s : items) {
            System.out.println(" - " + s);
        }

        // User String input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWhich element would you like to see again? (Enter index 0-" + (items.size() - 1) + "): ");
        String userInput = scanner.nextLine();

        try {
            // Autoboxing + Auto-unboxing example:
            // parseInt returns int, assigned to Integer (autoboxing), then back to int (unboxing)
            Integer boxedIndex = Integer.parseInt(userInput);
            int index = boxedIndex;                           

            // Attempt to print chosen element
            System.out.println("You selected: " + items.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception has been thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            // Not a valid integer input
            System.out.println("Exception has been thrown: Out of Bounds");
        } finally {
            scanner.close();
        }
    }
}