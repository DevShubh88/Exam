package com.demo.test;

import java.util.Scanner;

import com.demo.beans.BinarySearchTree;

public class testBST {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(60);
		bst.insert(35);
		bst.insert(75);
		bst.insert(40);
		bst.insert(20);
		bst.insert(70);
		bst.insert(85);
		System.out.println("Inorder traversal");
		bst.inorder();
		System.out.println();
		System.out.println("\nPreorder traversal");
		bst.preorder();
		System.out.println();
		System.out.println("\nPostorder traversal");
		bst.postorder();
		System.out.println();
		System.out.println("enter a num");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean s=bst.search(n);
		if(s)
			System.out.println("found");
		else {
			System.out.println("not found");
		}
	}

}
