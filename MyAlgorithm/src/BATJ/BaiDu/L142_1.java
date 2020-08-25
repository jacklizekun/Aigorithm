package BATJ.BaiDu;

import BATJ.BaiDu.L142.ListNode;

public class L142_1 {
	static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	     val = x;
	     next = null;
	     }
	}
	public static ListNode getIntersect(ListNode head) {
		ListNode tortoise = head;
		ListNode hare = head;
		while (hare != null  && hare.next != null) {
			tortoise = tortoise.next;
			hare = hare.next.next;
			if (tortoise == hare) {
				return tortoise;
			}
		}
		return null;
	}
	 public static ListNode detectCycle(ListNode head) {
		 if(head == null) {
			 return null;
		 }
		 ListNode interset = getIntersect(head);
		 if (interset == null) {
			return null;
		}
		ListNode ptr1 = head;
		ListNode ptr2 = interset;
		while (ptr1 != ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return ptr1;
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
			head6.next = head3;
			System.out.println(detectCycle(head).val);
	}
	
}
