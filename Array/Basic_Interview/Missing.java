
import java.util.HashSet;

/*public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1; // Including the missing number
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = totalSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}
*/

public  class  Missing{
    public static void main(String[] args) {
        
        int [] arr = {10 , 12 , 14 , 16 , 20};
        int start = 10;
        int end = 20;

        HashSet< Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);

        }
        System.out.print("Missing numbers: ");

        for(int i =start ; i<=end; i++){
            if(!set.contains(i)){ 
                System.out.print(i+" ");   //  Missing numbers: 11 13 15 17 18 19   // If the number i is not present in the set, then print it.
            }
        }
    }
}