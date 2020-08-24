package BATJ.BaiDu;

import java.util.Stack;
/**
 * 
 反转一个单链表。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL

 * @author lizk27
 *
 */
public class L206 {
	public static class ListNode {
				int val;
				ListNode next;
				ListNode(int x) { val = x; }
		  }
	public static ListNode reverseList(ListNode head) {
		ListNode preListNode = null;
		ListNode curListNode = head;
		while (curListNode != null) {
			ListNode nextListNode = curListNode.next;
			curListNode.next = preListNode;
			preListNode = curListNode;
			curListNode = nextListNode;	
		}
		return preListNode;
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		ListNode head6 = new ListNode(6);
		head.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = head6;
		head = reverseList(head);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
