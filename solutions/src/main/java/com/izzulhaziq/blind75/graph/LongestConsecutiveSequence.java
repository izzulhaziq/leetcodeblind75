package com.izzulhaziq.blind75.graph;

import com.izzulhaziq.blind75.FastScanner;
import com.izzulhaziq.blind75.Problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence implements Problem<Integer> {
    public int longestConsecutiveSort(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        // sort. O(n * log n)
        Arrays.sort(nums);

        int longest = 1;
        int curSequence = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] - nums[i - 1] == 1) {
                curSequence++;
            } else {
                longest = Math.max(longest, curSequence);
                curSequence = 1;
            }
        }
        return Math.max(longest, curSequence);
    }

    public int longestConsecutiveLinear(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        Set<Integer> nextSeq = new HashSet<>();
        for (int num : nums) {
            nextSeq.add(num);
        }

        int longest = 1;
        for (int num : nextSeq) {
            if (nextSeq.contains(num - 1))
                continue;

            int cur = num;
            int curSeq = 1;
            while (nextSeq.contains(++cur)) {
                curSeq++;

            }

            longest = Math.max(longest, curSeq);
        }

        return longest;
    }

    @Override
    public Integer solve(FastScanner scanner) {
        int[] nums = scanner.nextIntArray();
        return longestConsecutiveLinear(nums);
    }
}
