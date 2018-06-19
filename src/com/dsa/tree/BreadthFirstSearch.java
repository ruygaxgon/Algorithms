package com.dsa.tree;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		Node root = new Node(2);
		Node node1 = new Node(1);
		Node node2 = new Node(3);
		Node node3 = new Node(0);
		Node node4 = new Node(7);
		Node node5 = new Node(9);
		Node node6 = new Node(1);
		Node node7 = new Node(5);

		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node6.setLeft(node7);
		printByLevel(root);
		printTree(root);
		System.out.println(getHeight(root));
	}

	private static void printByLevel(Node root) {
		LinkedList<Node> nodeLevel = new LinkedList<Node>();
		LinkedList<Node> childrenLevel = new LinkedList<Node>();
		nodeLevel.add(root);
		while (!nodeLevel.isEmpty()) {
			Iterator<Node> iterator = nodeLevel.iterator();
			while (iterator.hasNext()) {
				Node node = (Node) iterator.next();
				System.out.print("(" + node + ")");
				if (node.getLeft() != null) {
					childrenLevel.add(node.getLeft());
				}
				if (node.getRight() != null) {
					childrenLevel.add(node.getRight());
				}
				if (iterator.hasNext()) {
					System.out.print(",");
				}
			}
			System.out.println("");
			nodeLevel = childrenLevel;
			childrenLevel = new LinkedList<Node>();
		}
	}

	private static void printTree(Node root) {
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node node = (Node) queue.poll();
			System.out.print("(" + node + ")");
			if (node.getLeft() != null) {
				queue.add(node.getLeft());
			}
			if (node.getRight() != null) {
				queue.add(node.getRight());
			}
		}
	}

	public static int getHeight(Node root) {
		if (root == null) {
			return -1;
		}

		int left = 1 + getHeight(root.getLeft());
		int right = 1 + getHeight(root.getRight());

		return Math.max(left, right);
	}
}

class Node {
	private Node left;
	private Node right;
	private int value;

	Node(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
