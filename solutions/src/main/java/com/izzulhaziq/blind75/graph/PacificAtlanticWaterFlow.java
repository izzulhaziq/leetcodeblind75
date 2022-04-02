package com.izzulhaziq.blind75.graph;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int ROWS = heights.length;
        int COLS = heights[0].length;

        boolean[][] pacific = new boolean[ROWS][COLS];
        boolean[][] atlantic = new boolean[ROWS][COLS];

        for (int r = 0; r < ROWS; r++) {
            dfs(heights, pacific, r, 0, 0);
            dfs(heights, atlantic, r, COLS - 1, 0);
        }

        for (int c = 0; c < COLS; c++) {
            dfs(heights, pacific, 0, c, 0);
            dfs(heights, atlantic, ROWS - 1, c, 0);
        }

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    result.add(Arrays.asList(r, c));
                }
            }
        }

        return result;
    }

    private void dfs(int[][] heights, boolean[][] visited, int r, int c, int prev) {
        if (r < 0 || c < 0 || r >= heights.length || c >= heights[0].length ||
                visited[r][c] || prev > heights[r][c]) {
            return;
        }

        visited[r][c] = true;
        dfs(heights, visited, r + 1, c, heights[r][c]);
        dfs(heights, visited, r - 1, c, heights[r][c]);
        dfs(heights, visited, r, c + 1, heights[r][c]);
        dfs(heights, visited, r, c - 1, heights[r][c]);
    }
}
