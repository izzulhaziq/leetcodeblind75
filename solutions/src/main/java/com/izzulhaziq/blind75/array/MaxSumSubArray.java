package com.izzulhaziq.blind75.array;

import com.izzulhaziq.blind75.FastScanner;
import com.izzulhaziq.blind75.Problem;

public class MaxSumSubArray implements Problem<Integer> {
    public int maxSubArray(int[] nums) {
        int localMax = 0;
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            localMax = Math.max(nums[i], nums[i] + localMax);
            res = Math.max(res, localMax);
        }

        return res;
    }

    @Override
    public Integer solve(FastScanner scanner) {
        int[] nums = scanner.nextIntArray();
        return maxSubArray(nums);
    }
}
