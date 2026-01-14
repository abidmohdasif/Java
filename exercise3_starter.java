import java.io.*;
import java.util.Scanner;

/**
 * Exercise 3: Starter Code
 * Abid Asif
 * 01/13/2026
 */

public class exercise3_starter {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter input file name : ");
        String inputFileName = input.nextLine().trim();
        if (inputFileName.isEmpty()) {
            inputFileName = "Exercise17_14.dat";
        }

        System.out.print("Enter output file name (decrypted file): ");
        String outputFileName = input.nextLine().trim();

        // Force output to be .txt
        if (!outputFileName.endsWith(".txt")) {
            outputFileName += ".txt";
        }

        try (
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(inputFileName));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outputFileName))
        ) {
            int value;
            while ((value = in.read()) != -1) {
                out.write(value - 5);
            }
        }

        System.out.println("Decryption complete! Output saved to: " + outputFileName);
    }
}
