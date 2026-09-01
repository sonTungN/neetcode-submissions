class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int minIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
                minIndex = i;
            }
        }

        int max = prices[minIndex];
        for (int i = minIndex; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }

        return max - min > 0 ? max - min : 0;
    }
}
