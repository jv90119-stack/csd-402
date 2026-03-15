// JOSE VELAZQUEZ
// MODULE 11.3 ASSIGNMENT 
// DATE: 03/15/2026
// This is assignment 3.2 being submitted for Assignment 11.3 as makeup work.  
// This program prints a pattern of powers of 2 in a pyramid shape, with an "@" symbol at the end of each line.

public class PowerPattern {

    public static void main(String[] args) {

        int rows = 7;

        for (int i = 0; i < rows; i++) {

            // Print leading spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print("  ");
            }

            // Print ascending powers of 2
            for (int j = 0; j <= i; j++) {
                System.out.print((int)Math.pow(2, j) + " ");
            }

            // Print descending powers of 2
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int)Math.pow(2, j) + " ");
            }

            // Print @ symbol at the end
            System.out.println("@");
        }
    }
}