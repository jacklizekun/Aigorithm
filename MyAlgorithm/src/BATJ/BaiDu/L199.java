package BATJ.BaiDu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class L199 {
	  public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public List<Integer> rightSideView(TreeNode root) {
		Map<Integer, Integer> rightmostValueAtDepth = new HashMap<Integer, Integer>();
		int max_depth = -1;
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		Stack<Integer> depthStack = new Stack<Integer>();
		nodeStack.push(root);
		depthStack.push(0);
		while (!nodeStack.isEmpty()) {
			TreeNode node = nodeStack.pop();
			int depth = depthStack.pop();
			if (node != null) {
				max_depth = Math.max(max_depth, depth);
				 if (!rightmostValueAtDepth.containsKey(depth)) {
	                    rightmostValueAtDepth.put(depth, node.val);
	                }

				 nodeStack.push(node.left);
				 nodeStack.push(node.right);
				 depthStack.push(depth+1);
				 depthStack.push(depth+1);
			}
		}
		List<Integer> rightView = new ArrayList<Integer>();
		for (int depth = 0; depth < max_depth; depth++) {
			 rightView.add(rightmostValueAtDepth.get(depth));
		}
		 return rightView;
    }
}
