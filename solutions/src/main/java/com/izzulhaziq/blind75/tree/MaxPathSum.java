package com.izzulhaziq.blind75.tree;

import com.izzulhaziq.blind75.TreeNode;

public class MaxPathSum {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }

        findMaxAtNode(root);
        return maxSum;
    }

    private int findMaxAtNode(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int maxLeft = findMaxAtNode(node.left);
        int maxRight = findMaxAtNode(node.right);

        // max of node itself, or, from left or from right to the node.
        int maxAtNode = Math.max(
                node.val,
                Math.max(maxLeft + node.val, maxRight + node.val));

        // update current global max
        maxSum = Math.max(
                maxSum, // prev max or,
                Math.max(
                        maxAtNode, // local max above
                        maxLeft + node.val + maxRight)); // left - node - right

        return maxAtNode;
    }
}
