public class ArmstrongNumbers {
    public static void main(String[] args) {
        int num, rem, sum;
        int limit = 153; // Upper limit for Armstrong numbers

        System.out.print("Armstrong numbers from 1 to " + limit + ": ");
        
        for (int i = 1; i <= limit; i++) {
            num = i;
            sum = 0; // Reset sum for each number
            
            while (num > 0) {
                rem = num % 10; // Extract the last digit
                sum += rem * rem * rem; // Add the cube of the digit to sum
                num /= 10; // Remove the last digit
            }
            
            // Check if the number is an Armstrong number
            if (sum == i) {
                System.out.print(i + " "); // Print the Armstrong number
            }
        }
    }
}

/*import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        // Step 1: Take user input for the limit
        System.out.print("Enter the upper limit: ");
        int limit = scanner.nextInt(); 
        
        System.out.print("Armstrong numbers from 1 to " + limit + ": ");
        
        // Step 2: Iterate from 1 to user-defined limit
        for (int i = 1; i <= limit; i++) {
            int num = i;
            int sum = 0;
            
            while (num > 0) {
                int rem = num % 10; // Extract the last digit
                sum += rem * rem * rem; // Cube the digit and add to sum
                num /= 10; // Remove the last digit
            }
            
            // Step 3: Check if number is Armstrong
            if (sum == i) {
                System.out.print(i + " "); // Print Armstrong number
            }
        }

        scanner.close();
    }
}
 */
