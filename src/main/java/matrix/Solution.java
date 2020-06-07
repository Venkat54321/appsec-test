package matrix;

public class Solution {

    public static void main(String[] args) {

        int[] array = {100,180,260,310,40,535,695};

        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
