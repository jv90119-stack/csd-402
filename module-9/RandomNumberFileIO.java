// JOSE VELAZQUEZ
// MODULE 9.2 ASSIGNMENT 
// DATE: 02/25/2026
// This program demonstrates the use of file I/O to write and read random numbers,
// and includes exception handling for file operations.


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberFileIO {

    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        // Write or append 10 random numbers to the file
        try (FileWriter writer = new FileWriter(file, true)) {
            if (file.length() > 0) {
                writer.write(" "); // add a space before appending if file already has content
            }

            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(11); 
                writer.write(num + (i < 9 ? " " : ""));
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Reopen file, read data, display it
        System.out.println("Contents of data.file:");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                System.out.print(fileScanner.nextInt() + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
