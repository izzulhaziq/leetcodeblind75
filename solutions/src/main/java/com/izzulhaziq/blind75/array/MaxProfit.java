package com.izzulhaziq.blind75.array;

import com.izzulhaziq.blind75.FastScanner;
import com.izzulhaziq.blind75.Problem;

public class MaxProfit implements Problem<Integer> {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy) {
                profit = Math.max(profit, prices[i] - buy);
            } else {
                buy = prices[i];
            }
        }

        return profit;
    }

    @Override
    public Integer solve(FastScanner scanner) {
        int[] prices = scanner.nextIntArray();
        return maxProfit(prices);
    }
}
