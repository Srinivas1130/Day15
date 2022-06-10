package com.bridgelabz.day15;

public class BinaryTreeUc1 {
	public static TreeNode root;

	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int data;

		public TreeNode(int data){
			this.data = data;
		}
	}

	public void CreatBinaryTrees(){
		TreeNode first = new TreeNode(56);
		TreeNode second = new TreeNode(30);
		TreeNode third = new TreeNode(70);

		root = first;
		first.left = second;
		first.right = third;
	}

	public void preOrder( TreeNode root){
		if(root == null){
			return;
		}
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void main(String[] args) {
		BinaryTreeUc1 binaryTree = new BinaryTreeUc1();
		binaryTree.CreatBinaryTrees();
		binaryTree.preOrder(binaryTree.root);
	}
}
