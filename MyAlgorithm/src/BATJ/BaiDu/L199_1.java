package BATJ.BaiDu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import BATJ.BaiDu.L199.TreeNode;

public class L199_1 {
	  public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	  public List<Integer> rightSideView(TreeNode root) {
		  Map<Integer, Integer> rightmostValueAtDepth  = new HashMap<Integer, Integer>();
		  int max_depth = -1;
		  Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
		  Queue<Integer> depthQueue = new LinkedList<Integer>();
		  nodeQueue.add(root);
		  depthQueue.add(0);
		  
		  while (!nodeQueue.isEmpty()) {
			TreeNode node = nodeQueue.poll();
			int depth = depthQueue.poll();
			if (node != null) {
				 max_depth = Math.max(max_depth, depth);
				 rightmostValueAtDepth.put(depth, node.val);
				 	nodeQueue.add(node.left);
	                nodeQueue.add(node.right);
	                depthQueue.add(depth+1);
	                depthQueue.add(depth+1);
			}
		}
		  
		  	List<Integer> rightView = new ArrayList<Integer>();
	        for (int depth = 0; depth <= max_depth; depth++) {
	            rightView.add(rightmostValueAtDepth.get(depth));
	        }

	        return rightView;

	  }
}
