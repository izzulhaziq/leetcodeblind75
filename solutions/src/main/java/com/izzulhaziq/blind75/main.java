package com.izzulhaziq.blind75;

import com.izzulhaziq.blind75.array.*;
import com.izzulhaziq.blind75.graph.CourseSchedule;
import com.izzulhaziq.blind75.graph.LongestConsecutiveSequence;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        FastScanner fastScanner = new FastScanner();
        print(new LongestConsecutiveSequence().solve(fastScanner));
    }

    private static void print(List<List<Integer>> answer) {
        System.out.println(answer);
    }

    private static void print(int answer) {
        System.out.println(answer);
    }

    private static void print(int[] answer) {
        System.out.println(Arrays.toString(answer));
    }

    private static void print(boolean answer) {
        System.out.println(answer);
    }
}
