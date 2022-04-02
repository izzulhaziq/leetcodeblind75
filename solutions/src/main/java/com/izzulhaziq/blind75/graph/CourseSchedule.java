package com.izzulhaziq.blind75.graph;

import com.izzulhaziq.blind75.FastScanner;
import com.izzulhaziq.blind75.Problem;

import java.util.*;

public class CourseSchedule implements Problem<Boolean> {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            adj.get(prereq[0]).add(prereq[1]);
        }

        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, adj, visited)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int course, Map<Integer, List<Integer>> adj, Set<Integer> visited) {
        if (visited.contains(course)) {
            // cycle
            return false;
        }

        if (adj.get(course).isEmpty()) {
            // no prereq for this course
            return true;
        }

        visited.add(course);
        for (int c : adj.get(course)) {
            if (!dfs(c, adj, visited)) {
                return false;
            }
        }
        visited.remove(course);
        adj.get(course).clear();

        // all of the prereq able to finish.
        return true;
    }

    @Override
    public Boolean solve(FastScanner scanner) {
        int numCourses = scanner.nextInt();
        scanner.nextIntMatrix();
    }
}
