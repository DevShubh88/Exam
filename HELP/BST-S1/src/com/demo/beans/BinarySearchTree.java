package com.demo.beans;

public class BinarySearchTree {

	class Node {
		int data;
		Node right;
		Node left;

		public Node(int data) {
			this.data = data;
			right = null;
			left = null;
		}
	}

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.data) {
			root.left = insertRec(root.left, key);
		} else {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	public void inorder() {
		inorderTraversal(root);
	}

	public void inorderTraversal(Node root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data + ",");
			inorderTraversal(root.right);
		}
	}

	// preorder traversal
	public void preorder() {
		preorderTraversal(root);
	}

	public void preorderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.data + ",");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}

	// postorder traversal
	public void postorder() {
		postorderTraversal(root);
	}

	public void postorderTraversal(Node root) {
		if (root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data + ",");
		}
	}

	public boolean search(int n) {
		if(root==null)
		{
			return false;
		}
		while(root!=null)
		{
			if(root.data==n)
			{
				return true;
			}
			if(root.data<=n)
			{
				root=root.right;
			}
			else {
				root=root.left;
			}
		}
		return false;
	}
}
