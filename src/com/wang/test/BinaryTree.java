package com.wang.test;

/*
 * 构建
 */
public class BinaryTree {

	private TreeNode root;

	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;

		public TreeNode(int data) {
			this.left = null;
			this.right = null;
			this.data = data;
		}
	}

	public BinaryTree() {
		root = null;
	}
}