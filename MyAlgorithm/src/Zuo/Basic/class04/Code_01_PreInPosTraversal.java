package Zuo.Basic.class04;

import java.util.Stack;

public class Code_01_PreInPosTraversal {
	public static class Node{
		public int value;
		public Node left;
		public Node right;
		
		public Node(int data) {
			this.value = data;
		}
	}
	
	public static void preOrderRecur(Node head) {
		if(head == null) {
			return ;
		}
		System.out.println(head.value + " ");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}
	
	public static void inOrderRecur(Node head) {
		if(head == null) {
			return ;
		}
		
		preOrderRecur(head.left);
		System.out.println(head.value + " ");
		preOrderRecur(head.right);
	}
	public static void posOrderRecur(Node head) {
		if (head == null) {
			return;
		}
		posOrderRecur(head.left);
		posOrderRecur(head.right);
		System.out.print(head.value + " ");
	}
	public static void preOrderUnRecur(Node head) {
		System.out.print("pre - order: ");
		if(head != null) {
			Stack<Node> stack = new Stack<Node>();
			stack.add(head);
			while(!stack.isEmpty()) {
				head = stack.pop();
				System.out.print(head.value + " ");
				if(head.right != null) {
					stack.push(head.right);
				}
				if(head.left != null) {
					stack.push(head.left);
				}
			}
		}
	         	System.out.println();
	}
	
	public static void inOrderUnRecur(Node head) {
		System.out.print("in-order: ");
		if(head != null) {
			Stack<Node> stack = new Stack<Node>();
			while(!stack.isEmpty() || head != null) {
				if(head != null) {
					stack.push(head);
					head = head.left;
				}else {
					head = stack.pop();
					System.out.print(head.value + " ");
					head = head.right;
				}
				
			}
		}
	}
	public static void posOrderUnRecur1(Node head) {
		System.out.print("pos-order: ");
		if (head != null) {
			Stack<Node> s1 = new Stack<Node>();
			Stack<Node> s2 = new Stack<Node>();
			s1.push(head);
			while (!s1.isEmpty()) {
				head = s1.pop();
				s2.push(head);
				if (head.left != null) {
					s1.push(head.left);
				}
				if (head.right != null) {
					s1.push(head.right);
				}
			}
			while (!s2.isEmpty()) {
				System.out.print(s2.pop().value + " ");
			}
		}
		System.out.println();
	}
	
}
