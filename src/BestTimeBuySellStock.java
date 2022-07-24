/*
 * 
 * Runtime: 3 ms, faster than 67.17% of Java online submissions for Best Time to Buy and Sell Stock.
 * Memory Usage: 83.3 MB, less than 61.99% of Java online submissions for Best Time to Buy and Sell Stock.
 * 
 * 
 * 
 */


public class BestTimeBuySellStock {
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
//		int[] prices = { 7, 6, 4, 1, 3 };
//		int[] prices = { 2, 4, 1 };
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {
		int lowestNumber = Integer.MAX_VALUE;
		int profit = 0;
		int priceIfSoldToday = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < lowestNumber) {
				lowestNumber = prices[i];
			}
			priceIfSoldToday = prices[i] - lowestNumber;

			if (profit < priceIfSoldToday) {
				profit = priceIfSoldToday;
			}
		}
		return profit;
	}
}
