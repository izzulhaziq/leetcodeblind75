package com.izzulhaziq.blind75.array;

import com.izzulhaziq.blind75.FastScanner;
import com.izzulhaziq.blind75.Problem;

public class MaxProductSubArray implements Problem<Integer> {

    public int maxProduct(int[] nums) {
        int res = nums[0];
        int curMin = 1;
        int curMax = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                curMax = 1;
                curMin = 1;
                res = Math.max(res, 0);
                continue;
            }

            int tmp = curMax * nums[i];
            curMax = Math.max(nums[i], Math.max(tmp, curMin * nums[i]));
            curMin = Math.min(nums[i], Math.min(tmp, curMin * nums[i]));

            res = Math.max(res, curMax);
        }

        return res;
    }

    @Override
    public Integer solve(FastScanner scanner) {
        int[] nums = scanner.nextIntArray();
        return maxProduct(nums);
    }
}
