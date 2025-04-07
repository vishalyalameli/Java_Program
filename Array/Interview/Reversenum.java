
import java.util.Scanner;



 class Reversenum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Enter Number:");
        int num = sc.nextInt();

        int reversed = 0; //This will store the reversed number

        while(num!=0){
            int digit = num%10;   // Get last digit
            reversed = reversed*10 +digit;  // Add it to reversed number
            num = num/10;   // Remove last digit
  
        }
        System.out.println(" Reverse Number :" + reversed);
    }
//   Reverse Number :4321
    
}