package com.izzulhaziq.blind75;

import com.izzulhaziq.blind75.array.*;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        FastScanner fastScanner = new FastScanner();
        print(new MaxProductSubArray().solve(fastScanner));
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
