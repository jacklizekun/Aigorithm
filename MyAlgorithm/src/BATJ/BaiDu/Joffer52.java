package BATJ.BaiDu;

public class Joffer52 {
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
	  }
		      public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		          if (headA == null || headB == null) return null;
		          ListNode node1=headA;
		          ListNode node2=headB;
		          while (node1!=node2){
		              node1=(node1==null)?headB:node1.next;
		              node2=(node2==null)?headA:node2.next;
		          }
		          return node1;
		      }
}
