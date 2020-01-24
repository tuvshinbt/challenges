package bt.pre.algo.problems.medium;

import java.util.*;

import bt.pre.algo.problems.TreeNode;

public class _98ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        this.inOrderTraversal(root, list);

        if (list.size() == 1)
            return true;
        int i = 1;
        while (i < list.size()) {
            if (list.get(i - 1) >= list.get(i)) {
                return false;
            }
            i++;
        }
        return true;

    }

    private void inOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        this.inOrderTraversal(node.left, list);
        list.add(node.val);
        this.inOrderTraversal(node.right, list);
    }
}
