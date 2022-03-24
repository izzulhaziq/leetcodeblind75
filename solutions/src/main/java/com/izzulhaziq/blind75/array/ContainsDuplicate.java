package com.izzulhaziq.blind75.array;

import com.izzulhaziq.blind75.FastScanner;
import com.izzulhaziq.blind75.Problem;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate implements Problem<Boolean> {
    public boolean containsDuplicate(int[] nums) {
        // O(n) time with O(n) space with set
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    @Override
    public Boolean solve(FastScanner scanner) {
        int[] nums = scanner.nextIntArray();
        return containsDuplicate(nums);
    }
}
