package BATJ.BaiDu;

public class L19 {
	 public static class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) { val = x; }
		 }
	  public ListNode removeNthFromEnd(ListNode head, int n) {
		  	ListNode dummy = new ListNode(0);
		  	dummy.next = head;
		  	int length = 0;
		  	ListNode first = head;
		  	
		  	while (first != null) {
				first = first.next;
				length ++;
			}
		  	length -= n;
		  	first = dummy;
		  	while (length > 0) {
				length --;
				first = first.next;
			}
		  	first.next = first.next.next;
		  	return dummy.next;
	  }

}
