
// public class PalindromeNum {
//     public static void main(String [ ] args){
//         int num = 1241 , reversed = 0, original = num;

//     while(num!=0){
//         int digit = num % 10;
//         reversed = reversed *10 + digit;
//         num = num /10;
//     }
//     System.out.println(original == reversed ? " it is Palindrome" : "Not Palindrome");
//     }
    
// }

 import java.util.*;

 class  PalindromeNum{
    public static void main(String [ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int num = sc.nextInt();

        int reversed = 0  , temp =num;
        
        while(num>0){
            int digit = num %10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if(temp == reversed){
            System.out.print(reversed+ "is palindrome");

        }else{
            System.out.print(reversed + " is not palindrome");
        }
        
    }
 }


// A palindrome is a word, number, phrase, or sequence that reads the same backward as forward.