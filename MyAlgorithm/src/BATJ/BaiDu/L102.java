package BATJ.BaiDu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L102 {
	 public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
	 	}
	  public static List<List<Integer>> levelOrder(TreeNode root) {
		  if (root == null) {
			  return new ArrayList<List<Integer>>();
		  }
		  	Queue queue = new LinkedList<TreeNode>();
		  	queue.offer(root);
		  	List<List<Integer>> resList = new ArrayList<List<Integer>>();
		  	
		  	while (!queue.isEmpty()) {
		  		List<Integer> onceList = new ArrayList<Integer>();
		  		int size = queue.size();
		  		while (size != 0) {
					TreeNode node =  (TreeNode) queue.poll();
					onceList.add(node.val);
					if (node.left != null) {
						queue.offer(node.left);
					}
					if (node.right != null) {
						queue.offer(node.right);
					}
					
					size--;
				}
		  		resList.add(onceList);
			}
		  	return resList;
	    }

}
