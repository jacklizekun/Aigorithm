package BATJ.BaiDu;

import BATJ.BaiDu.L141.ListNode;

public class L141_1 {
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 public static boolean hasCycle(ListNode head) {
		 if (head == null || head.next == null) {
			return false;
		}
		 ListNode fasListNode = head.next;
		 ListNode slowListNode = head;
		 while (fasListNode != slowListNode) {
			 if (fasListNode == null || fasListNode.next == null) {
		            return false;
		      }
			 
			fasListNode = fasListNode.next.next;
			slowListNode = slowListNode.next;
		}
		    return true;
		
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
			//head6.next = head3;
			System.out.println(hasCycle(head));
	}
}
