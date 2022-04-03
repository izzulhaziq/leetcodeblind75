package com.izzulhaziq.blind75.tree;

import com.izzulhaziq.blind75.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invertTreeRecursion(root);
        return root;
    }

    private void invertTreeRecursion(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        invertTreeRecursion(node.left);
        invertTreeRecursion(node.right);
    }
}
