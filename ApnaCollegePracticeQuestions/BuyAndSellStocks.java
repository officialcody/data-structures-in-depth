package ApnaCollegePracticeQuestions;

// Best time to buy and sell stocks

public class BuyAndSellStocks {
    public static int buyAndSellStocks(int [] prices, int n) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{7,1,5,3,2,4};
        int answer = buyAndSellStocks(arr, 6);
        System.out.println("Maximum profit: " + answer);
    }
}
