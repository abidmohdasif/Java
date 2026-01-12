import java.io.*;

/**
 * Exercise 1: Write 100 random integers to a text file
 * 
 * Requirements:
 * - Create a file named Exercise17_01.txt if it does not exist
 * - If the file already exists, APPEND new data (don't overwrite)
 * - Write 100 integers created randomly (use Math.random())
 * - Integers should be separated by a space
 * - Use text I/O (PrintWriter)
 * 
 * @author Abid Asif
 * 1/12/2026
 */
public class exercise1_starter {
    
    public static void main(String[] args) throws IOException {
        // TODO: Create a File object for "Exercise17_01.txt"
        File file = new File("Exercise17_.txt");
        
        // TODO: Create PrintWriter in APPEND mode
        try (PrintWriter output = new PrintWriter(new FileWriter(file,true))) {
        // TODO: Generate and write 100 random integers
            for (int i = 0; i < 100; i++) {
                int randomNum = (int)(Math.random() * 100); // Hint: Use Math.random() to generate random integers
                output.print(randomNum + " ");
            }
            // TODO: Close the file (or use try-with-resources)
            output.println();

        }
        // Hint: Use FileWriter with append parameter set to true
    
        
        
        
        
        // Hint: Separate integers with a space
        
        
        
        
        
        System.out.println("100 random integers written to Exercise17_01.txt");
    }
}