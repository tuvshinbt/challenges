package bt.pre.algo.problems.medium;

import java.util.*;

import bt.pre.algo.problems.TreeNode;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * Example:
 * 
 * Input: [1,null,2,3]
 * 
 * Output: [1,3,2] Follow up: Recursive solution is trivial, could you do it
 * iteratively?
 * 
 *
 */
public class _94BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // this.doTraversal(root, result);

        TreeNode node = root;
        Stack<TreeNode> st = new Stack<>();
        st.push(node);
        while (!st.isEmpty()) {
            if (st.peek().left != null) {
                st.push(st.peek().left);
            }
            else {
                TreeNode n = st.pop();
                result.add(n.val);
                if (!st.isEmpty() && st.peek() != null) {
                    st.peek().left = null;
                }
                if (n.right != null) {
                    st.push(n.right);
                }
            }
        }
        return result;
    }
}
