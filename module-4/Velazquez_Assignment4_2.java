// JOSE VELAZQUEZ SAENZ 
// MODULE 4.2 ASSIGNMENT 

// THIS PROGRAM CALCULATES THE AVERAGE OF ARRAYS OF DIFFERENT PRIMITIVE DATA TYPES
// USING METHOD OVERLOADING. IT DEFINES FOUR METHODS TO CALCULATE THE AVERAGE OF SHORT, INT, LONG, AND DOUBLE ARRAYS.
// THE MAIN METHOD TESTS THESE METHODS WITH SAMPLE ARRAYS AND DISPLAYS THE RESULTS.


public class Velazquez_Assignment4_2{

    /* ===== Overloaded Average Methods ===== */

    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    /* ===== Test Program ===== */

    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30};                // size 3
        int[] intArray = {5, 15, 25, 35};                 // size 4
        long[] longArray = {100L, 200L, 300L, 400L, 500L}; // size 5
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5}; // size 6

        displayResults("Short Array", shortArray, average(shortArray));
        displayResults("Int Array", intArray, average(intArray));
        displayResults("Long Array", longArray, average(longArray));
        displayResults("Double Array", doubleArray, average(doubleArray));
    }

    /* ===== Helper Methods for Display ===== */

    private static void displayResults(String title, short[] array, short avg) {
        System.out.println(title + ":");
        printArray(array);
        System.out.println("Average: " + avg);
        System.out.println();
    }

    private static void displayResults(String title, int[] array, int avg) {
        System.out.println(title + ":");
        printArray(array);
        System.out.println("Average: " + avg);
        System.out.println();
    }

    private static void displayResults(String title, long[] array, long avg) {
        System.out.println(title + ":");
        printArray(array);
        System.out.println("Average: " + avg);
        System.out.println();
    }

    private static void displayResults(String title, double[] array, double avg) {
        System.out.println(title + ":");
        printArray(array);
        System.out.println("Average: " + avg);
        System.out.println();
    }

    private static void printArray(short[] array) {
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printArray(long[] array) {
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
