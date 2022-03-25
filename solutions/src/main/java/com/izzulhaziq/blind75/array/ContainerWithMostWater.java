package com.izzulhaziq.blind75.array;

import com.izzulhaziq.blind75.FastScanner;
import com.izzulhaziq.blind75.Problem;

public class ContainerWithMostWater implements Problem<Integer> {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;

        int maxArea = 0;
        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, area);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }

    @Override
    public Integer solve(FastScanner scanner) {
        return maxArea(scanner.nextIntArray());
    }
}
