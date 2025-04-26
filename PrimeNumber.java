import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt(); // Read user input

        int count = 0;

        // Loop to count the number of divisors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                  count++;
            }
        }

        // Check if the number is prime
        if (count == 2) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close(); // Close Scanner
    }
}


// Enter Your Number
// 5
// It is Prime Number

// Enter Your Number: 10
// 10 is NOT a Prime Number.

