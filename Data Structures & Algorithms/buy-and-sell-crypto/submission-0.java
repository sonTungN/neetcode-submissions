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
        System.out.println(min);

        int max = prices[minIndex];
        for (int i = minIndex; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        System.out.println(max);

        return max - min > 0 ? max - min : 0;
    }
}
