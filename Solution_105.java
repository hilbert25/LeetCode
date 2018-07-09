package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月9日 上午9:18:35 LeetCode com.hilbert25.leetcode
 *          Solution_105
 */
public class Solution_105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder = { 1, 2, 3, 4, 5, 6, 7 };
		int[] inorder = { 4, 2, 5, 1, 6, 3, 7 };
		buildTree(preorder, inorder);

	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// /**
	// * @param preorder
	// * @param inorder
	// * @return
	// */
	// public static TreeNode buildTree(int[] preorder, int[] inorder) {
	// if (preorder.length == 0)
	// return null;
	// TreeNode root = new TreeNode(preorder[0]);
	// int middle = 0;
	// while (inorder[middle] != preorder[0]) {
	// middle++;
	// }
	// getChild(preorder, inorder, 0, middle, inorder.length-1, 0, root);
	// return root;
	// }
	//
	// /**
	// * @param preorder
	// * @param inorder
	// * @param left
	// * @param middle
	// * @param right
	// * @param i
	// * @param middleNode
	// */
	// public static void getChild(int[] preorder, int[] inorder, int left, int
	// middle, int right, int i,
	// TreeNode middleNode) {
	// if (left >= 0 && middle > left) {
	// TreeNode leftChild = new TreeNode(preorder[i + 1]);
	// middleNode.left = leftChild;
	// int nextMiddle = left;
	// while (inorder[nextMiddle] != preorder[i + 1]) {
	// nextMiddle++;
	// }
	// getChild(preorder, inorder, left, nextMiddle, middle - 1, i + 1,
	// leftChild);
	// }
	// if (right <= inorder.length && right > middle) {
	// TreeNode rightChild = new TreeNode(preorder[i + (middle - left) + 1]);
	// middleNode.right = rightChild;
	// int nextMiddle = middle + 1;
	// while (inorder[nextMiddle] != preorder[i + (middle - left) + 1]) {
	// nextMiddle++;
	// }
	// getChild(preorder, inorder, middle + 1, nextMiddle, right, i + (middle -
	// left) + 1, rightChild);
	// }
	// }
	private static int ppos = 0; // preorder array position
	private static int ipos = 0; // inorder array position

	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		return addNode(preorder, inorder, null);
	}

	private static TreeNode addNode(int[] preorder, int[] inorder, TreeNode parent) {
		if (ppos >= preorder.length || ipos >= inorder.length)
			return null;
		if (parent != null && inorder[ipos] == parent.val) {//这种情况说明没有左子节点
			ipos++;
			return null;
		}

		TreeNode n = new TreeNode(preorder[ppos++]);
		n.left = addNode(preorder, inorder, n);
		n.right = addNode(preorder, inorder, parent);

		return n;
	}
}
