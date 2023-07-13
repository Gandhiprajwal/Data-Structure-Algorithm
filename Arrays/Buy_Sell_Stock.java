package Arrays;

public class Buy_Sell_Stock {
    // Time Complexity - O(n)
    static int buy_sell(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i]; 
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7,8,5,3,6,4};
        System.out.println(buy_sell(price));;
    }
}
