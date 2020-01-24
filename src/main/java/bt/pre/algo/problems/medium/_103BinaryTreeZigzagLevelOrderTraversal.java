package bt.pre.algo.problems.medium;

import java.util.*;

import bt.pre.algo.problems.TreeNode;

public class _103BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }

        Queue<TreeNode> qi = new LinkedList<>();
        qi.add(root);

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> level = new ArrayList<>();

        boolean isLeft = true;
        while (!qi.isEmpty()) {
            int cnt = qi.size();
            level = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                TreeNode n = qi.poll();
                if (n.left != null) {
                    qi.add(n.left);
                }
                if (n.right != null) {
                    qi.add(n.right);
                }
                if (isLeft) {
                    level.add(n.val);
                }
                else {
                    level.add(0, n.val);
                }
            }
            isLeft = !isLeft;
            result.add(level);
        }
        return result;
    }
}
