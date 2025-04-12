import java.util.Scanner;

public class StrongNumber {
    public static int factorial(int num){

        int fact = 1;

        for(int i =1 ; i<=num ;i ++){
            fact *= i;

        }
        return  fact;
    }

    public static void main(String [ ]args){
         Scanner sc= new Scanner(System.in);

         System.out.println("Enter Number");

         int number = sc.nextInt();
         int temp = number;
         int sum = 0;

         while(temp >0){
            int digit = temp %10;
            sum += factorial(digit);
            temp /= 10;
         }

        if(sum == number){
            System.out.println(number + "it is Strong Number");
        }else{
            System.out.println( number + "it is not Strong Number");
        }
    }
    
}
