public class MaxProfit {
    public static void main(String [] args){
        int [] Price = {13,2,7,11,3,5,10,8};
        int SellDay = 0 ;
        int BuyDay = 0 ;
        int MaxProfit = 0 ;

        for(int i = 0 ; i< Price.length -1 ; i++){
            for(int j = i+1 ; j<Price.length; j++){
                int Profit= Price[j] - Price[i];
                if(Profit > MaxProfit){
                    MaxProfit = Profit;
                    BuyDay = j+1;
                    SellDay = i+1;
                   
                }
            }
        }
        System.out.println("BuyDay" + BuyDay+ " ,SellDay" +SellDay+ ",MaxProfit" + MaxProfit);
    }
    
}

/* 
Final Result:
 Buy Day: 2 (prices[1] = 2)

 Sell Day: 4 (prices[3] = 11)

 Max Profit: 9 (11 - 2) 
 */