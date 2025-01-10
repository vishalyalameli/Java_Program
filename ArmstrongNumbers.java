public class ArmstrongNumbers {
    public static void main(String[] args) {
        int num, rem, sum;
        int limit = 1000; // Upper limit for Armstrong numbers

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
