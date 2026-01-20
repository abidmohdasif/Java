/**
 * Abid Asif
 * Date: 1/20/2024
 * Find the factorial of the input
 */
 
import java.math.BigInteger;
import java.util.Scanner;
 
public class factorial1 {
   
    public static BigInteger factorial(BigInteger n) {
        // TODO: Implement base case
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else        
            // TODO: Implement recursive case
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
       
    }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();
       
        // Convert to BigInteger
        BigInteger n = new BigInteger(String.valueOf(number));
       
        // Calculate factorial
        BigInteger result = factorial(n);
       
        // Display result
        System.out.println(number + "! = " + result);
       
        input.close();
    }
}
 
 