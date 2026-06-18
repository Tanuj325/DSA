public class StockBuyAndSell {

    static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;

        System.out.println("Day\tPrice\tMinPrice\tCost\tProfit");
        System.out.println("------------------------------------------");

        for (int i = 0; i < prices.length; i++) {

            int cost = prices[i] - minPrice;
            profit = Math.max(profit, cost);

            System.out.println(
                    i + "\t" +
                    prices[i] + "\t" +
                    minPrice + "\t\t" +
                    cost + "\t" +
                    profit
            );

            minPrice = Math.min(minPrice, prices[i]);
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4, 3};

        int ans = maxProfit(arr);

        System.out.println("\nMaximum Profit = " + ans);
    }
}