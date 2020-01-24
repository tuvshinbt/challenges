package bt.pre.algo.problems.easy;

import java.util.*;

import bt.pre.algo.problems.TreeNode;

public class _101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        List<Integer> ll = new ArrayList<>();
        this.preOrderTraversal(root.left, ll);
        List<Integer> rl = new ArrayList<>();
        this.postOrderTraversal(root.right, rl);

//        System.out.println(ll);
//        System.out.println(rl);

        if (ll.size() != rl.size()) {
            return false;
        }

        int s = 0, e = rl.size() - 1;
        while (s < ll.size()) {
            if (ll.get(s) != rl.get(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;

    }

    private void inOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            list.add(null);
            return;
        }
        this.inOrderTraversal(node.left, list);
        list.add(node.val);
        this.inOrderTraversal(node.right, list);
    }

    private void preOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            list.add(null);
            return;
        }
        list.add(node.val);
        this.preOrderTraversal(node.left, list);
        this.preOrderTraversal(node.right, list);
    }

    private void postOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            list.add(null);
            return;
        }
        this.postOrderTraversal(node.left, list);
        this.postOrderTraversal(node.right, list);
        list.add(node.val);
    }
}
