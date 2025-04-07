

public class PalindromeString {
    public static void main(String[] args) {
        String str= "madam" , reversed = new StringBuffer(str).reverse().toString();

        System.out.println(str.equals(reversed) ? "it is Palindrome String " : " Not Palindrome");
        
    }
    
}
