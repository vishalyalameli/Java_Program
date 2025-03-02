import java.util.Scanner;

class ReadValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        System.out.println("You entered: " + num);
        
        s.close();//
    }
}

// Enter a number: 10
// You entered: 10
