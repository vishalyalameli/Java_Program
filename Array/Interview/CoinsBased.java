import java.util.Arrays;
public class CoinsBased {

    public  static void main(String [ ]args){

        int [] coins = { 1,5,10,25};
         int amount = 63;
        Arrays.sort(coins);
        int count = 0;

        for(int i = coins.length-1; i>= 0; i--){
            while(amount >= coins[i]){
                amount -= coins[i];
                count++;
            }


        }
        System.out.println(" Minimum required:" + count);
    }

    
}
 
// Minimum required:                       Coin-Based Greedy Algorithm
