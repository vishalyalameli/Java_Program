import java.util.Scanner;

public class RecursionEx {
    public static int Factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the factorial number");
        int number = scanner.nextInt();

        int result = Factorial(number);
        System.out.print("Factorial number is:" + number + "is :" + result);
        scanner.close();
    }
}
