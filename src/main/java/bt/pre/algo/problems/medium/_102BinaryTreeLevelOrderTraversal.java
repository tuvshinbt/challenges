package bt.pre.algo.problems.medium;

import java.util.*;

import bt.pre.algo.problems.TreeNode;

public class _102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }

        Queue<TreeNode> qi = new LinkedList<>();
        qi.add(root);

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> level = new ArrayList<>();

//        boolean isLeft = true;
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
                // if (isLeft) {
                level.add(n.val);
                // } else {

                // }
            }
            result.add(level);
        }
        return result;
    }

    public List<List<Integer>> levelOrder1(TreeNode root) {

        if (root == null) {
            return new ArrayList<List<Integer>>();
        }

        Queue<TreeNode> qi = new LinkedList<>();
        qi.add(root);
        int curLevelCount = 1, nextLevelCount = 0;

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> level = new ArrayList<>();
        while (!qi.isEmpty()) {
            TreeNode n = qi.poll();
            curLevelCount--;
            level.add(n.val);

            if (n.left != null) {
                qi.add(n.left);
                nextLevelCount++;
            }
            if (n.right != null) {
                qi.add(n.right);
                nextLevelCount++;
            }

            if (curLevelCount == 0) {
                result.add(level);
                level = new ArrayList<>();
                curLevelCount = nextLevelCount;
                nextLevelCount = 0;
            }
        }
        return result;
    }
}
