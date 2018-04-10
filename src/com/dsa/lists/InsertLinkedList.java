package com.dsa.lists;

public class InsertLinkedList {

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Node head = null;
		int[] array = {1,2,3,4,5};

		for(int n : array) {
			int ele = n;
			head = insert(head, ele);
		}
		display(head);
	}

	public static Node insert(Node head, int data) {
		System.out.println(data);
		if (head == null) {
			System.out.println("Create head");
			head = new Node(data);
		} else if (head.next == null) {
			System.out.println("Create next");
			head.next = new Node(data);
		} else {
			insert(head.next, data);
		}
		return head;
	}
}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}