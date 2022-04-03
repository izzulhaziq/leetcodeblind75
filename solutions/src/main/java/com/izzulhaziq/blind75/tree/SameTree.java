package com.izzulhaziq.blind75.tree;

import com.izzulhaziq.blind75.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameTreeIterative(p, q);
    }

    private boolean isSameTreeRecursion(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        // check the structure & value
        if (node1 == null || node2 == null ||
                node1.val != node2.val) {
            return false;
        }

        // check if left & right children are the same as well.
        return isSameTreeRecursion(node1.left, node2.left) &&
                isSameTreeRecursion(node1.right, node2.right);
    }

    private boolean isSameTreeIterative(TreeNode node1, TreeNode node2) {
        Queue<TreeNode[]> queue = new ArrayDeque<>();
        queue.add(new TreeNode[]{node1, node2});

        while (!queue.isEmpty()) {
            TreeNode[] pair = queue.poll();

            if ((pair[0] != null && pair[1] == null) ||
                    (pair[0] == null && pair[1] != null)) {
                return false;
            }

            if (pair[0] != null) {
                if (pair[0].val != pair[1].val) {
                    return false;
                }

                queue.add(new TreeNode[]{pair[0].left, pair[1].left});
                queue.add(new TreeNode[]{pair[0].right, pair[1].right});
            }
        }

        return true;
    }
}
