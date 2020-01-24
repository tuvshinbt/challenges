package bt.pre.algo.problems.medium;

import java.util.*;
import java.util.stream.Collectors;

import bt.pre.algo.problems.TreeNode;

public class _105ConstructBinaryTreefromPreorderInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
            return null;
        }
        List<Integer> preorderL = Arrays.stream(preorder).boxed().collect(Collectors.toList());
        List<Integer> inorderL = Arrays.stream(inorder).boxed().collect(Collectors.toList());
        TreeNode result = this.buildTree(preorderL, inorderL);
        return result;
    }

    private TreeNode buildTree(List<Integer> preorder, List<Integer> inorder) {
        if (0 == preorder.size()) {
            // todo
            return null;
        }
        if (inorder == null || inorder.size() == 0) {
            return null;
        }
        int val = preorder.remove(0);
        TreeNode n = new TreeNode(val);
        int inId = inorder.indexOf(val);
        if (inId - 1 > -1) {
            List<Integer> leftHalf = new LinkedList<>(inorder.subList(0, inId));
            n.left = this.buildTree(preorder, leftHalf);
        }
        if (inId + 1 < inorder.size()) {
            List<Integer> rigthHalf = new LinkedList<>(inorder.subList(inId + 1, inorder.size()));
            n.right = this.buildTree(preorder, rigthHalf);
        }
//        inorder.remove(inId);
        return n;
    }
}
