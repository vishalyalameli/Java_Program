
public class PalindromeNum {
    public static void main(String [ ] args){
        int num = 1241 , reversed = 0, original = num;

    while(num!=0){
        int digit = num % 10;
        reversed = reversed *10 + digit;
        num = num /10;
    }
    System.out.println(original == reversed ? " it is Palindrome" : "Not Palindrome");
    }
    
}


// A palindrome is a word, number, phrase, or sequence that reads the same backward as forward.