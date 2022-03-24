package com.izzulhaziq.blind75.array;

import com.izzulhaziq.blind75.FastScanner;
import com.izzulhaziq.blind75.Problem;

import java.util.Arrays;

public class ProductOfArrayExceptSelf implements Problem<int[]> {
    public int[] productExceptSelf(int[] nums) {
        // 2 pass from left & right
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);

        int productSoFar = 1;
        for (int i = 1; i < nums.length; i++) {
            productSoFar *= nums[i - 1];
            res[i] = productSoFar * res[i];
        }

        productSoFar = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            productSoFar *= nums[i + 1];
            res[i] = productSoFar * res[i];
        }

        return res;
    }

    @Override
    public int[] solve(FastScanner scanner) {
        int[] nums = scanner.nextIntArray();
        return productExceptSelf(nums);
    }
}
