package bt.pre.algo.problems.top.medium;

import java.util.HashMap;
import java.util.Map;

import bt.pre.algo.problems.top.TreeNode;

public class _12_ConstructBinaryTreeFromPreorderAndInorderTraversal {

	public TreeNode buildTree(int[] preorder, int[] inorder) {

		if (preorder.length == 0) {
			return null;
		} else if (preorder.length == 1) {
			return new TreeNode(preorder[0]);
		}

		Map<Integer, Integer> inorderMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}

		TreeNode result = buildTreeRec(0, inorder.length - 1, preorder, inorderMap);
		return result;
	}

	private int indexInPreOrder = 0;

	private TreeNode buildTreeRec(int s, int e, int[] preorder, Map<Integer, Integer> inorderMap) {

		if (s > e) {
			return null;
		}

		int elem = preorder[indexInPreOrder];
		int elemIndex = inorderMap.get(elem);

		if (s > elemIndex || elemIndex > e) {
			return null;
		}

		TreeNode treeNode = new TreeNode(elem);
		indexInPreOrder++;
		treeNode.left = buildTreeRec(s, elemIndex - 1, preorder, inorderMap);
		treeNode.right = buildTreeRec(elemIndex + 1, e, preorder, inorderMap);
		return treeNode;

	}

	private int inIndex = 0;
	private int preIndex = 0;

	public TreeNode solutionBuildTree(int[] preorder, int[] inorder) {
		return build(preorder, inorder, (long) Integer.MIN_VALUE - 1);
	}

	public TreeNode build(int[] preorder, int[] inorder, long stop) {
		if (preIndex >= preorder.length)
			return null;
		if (inorder[inIndex] == stop) {
			inIndex++;
			return null;
		}
		TreeNode node = new TreeNode(preorder[preIndex++]);
		node.left = build(preorder, inorder, node.val);
		node.right = build(preorder, inorder, stop);
		return node;
	}
}
