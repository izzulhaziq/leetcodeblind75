package com.izzulhaziq.blind75.tree;

import com.izzulhaziq.blind75.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        // null < 5 < null
        // null < 1 < 5
        // 5 < 6 < null
        // 5 < 3 < 6
        // 6 < 8 < null
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode node, Integer leftBound, Integer rightBound) {
        if (node == null) {
            return true;
        }

        if (leftBound != null && node.val <= leftBound ||
                rightBound != null && node.val >= rightBound) {
            return false;
        }

        return isValid(node.left, leftBound, node.val) &&
                isValid(node.right, node.val, rightBound);
    }
}
