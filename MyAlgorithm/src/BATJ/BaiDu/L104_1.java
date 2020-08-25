package BATJ.BaiDu;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class L104_1 {
	 public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	   public static int maxDepth(TreeNode root) {  
		   if (root == null) {
	            return 0;
	        }
		    Queue<TreeNode> queue = new LinkedList<>();
		    queue.offer(root);
		    int ans = 0;
		    while (!queue.isEmpty()) {
		    	int size = queue.size();
				while (size > 0 ) {
					TreeNode node = queue.poll();
					if (node.left != null) {
						queue.offer(node.left);
					}
					if (node.right != null) {
						queue.offer(node.right);
					}
					size -- ;
				}
				ans ++;
			}
		    System.out.println(ans);
		    return ans;
	    }
	   public static void main(String[] args) {
		 	TreeNode root = new TreeNode(3);
			TreeNode leftroot = new TreeNode(9);
			TreeNode rightroot= new TreeNode(20);
			TreeNode rightleft= new TreeNode(15);
			TreeNode rightright= new TreeNode(7);
			root.left = leftroot;
			root.right = rightroot;
			rightroot.left = rightleft;
			rightroot.right = rightright;
			maxDepth(root);
	}
}
