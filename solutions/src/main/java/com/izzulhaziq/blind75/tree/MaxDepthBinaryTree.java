package com.izzulhaziq.blind75.tree;

import com.izzulhaziq.blind75.TreeNode;

public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        // 3 - 1
        // 9 - 2
        // 20 - 2
        // 15 - 3
        // 7 - 3
        return calculateDepth(root, 0);
    }

    private int calculateDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        depth++;
        return Math.max(
                calculateDepth(node.left, depth), calculateDepth(node.right, depth));
    }
}
