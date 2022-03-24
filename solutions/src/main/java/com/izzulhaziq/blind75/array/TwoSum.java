package com.izzulhaziq.blind75.array;

import com.izzulhaziq.blind75.FastScanner;
import com.izzulhaziq.blind75.Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum implements Problem<int[]> {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder) && map.get(remainder) != i) {
                return new int[] { i, map.get(remainder) };
            }
        }

        return new int[0];
    }

    @Override
    public int[] solve(FastScanner scanner) {
        int[] nums = scanner.nextIntArray();
        int target = scanner.nextInt();

        return twoSum(nums, target);
    }
}
