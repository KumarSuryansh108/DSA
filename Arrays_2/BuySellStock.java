public class BuyandSellStocks {
    public static int BuySellStock(int[] prices){
        // declare : maxprofit and buyprice : max value 
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        // loop
        for(int i = 1; i < prices.length ; i++){
            // comparison
            int sellingPrice = prices[i];
            if(buyPrice < sellingPrice){
                int profit = sellingPrice - buyPrice;
                maxProfit = Math.max(maxProfit, profit); //check max profit
            }
            else{
                buyPrice = sellingPrice; //if selling price is less then change buyPrice to current selling price
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // Buy and Sell Stocks: Time complexity : O(n)
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Max profit : "+ BuySellStock(prices));

    }
}
