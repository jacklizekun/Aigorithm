package BATJ.BaiDu;

import java.util.HashSet;

import BATJ.BaiDu.L142_1.ListNode;

public class L141 {
	
	  public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
	  }
	 public static boolean hasCycle(ListNode head) {
		 HashSet<ListNode> hashSet = new HashSet<>();
		 if (head == null) {
			return false;
		}
		 while (!hashSet.contains(head) && head.next != null) {
			hashSet.add(head);
			head = head.next;
		}
		
		 if (head.next == null) {
			return false;
		}else {
			return true;
		}
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
