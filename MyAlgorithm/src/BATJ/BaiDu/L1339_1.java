package BATJ.BaiDu;

import BATJ.BaiDu.L1339.TreeNode;

public class L1339_1 {

	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	    double ans = Double.MIN_VALUE;
	    double allSum;
	    double nodeSum;
	    public int maxProduct(TreeNode root) {
	        allSum = sum(root);
	        dfs(root);
	        return (int)(ans % (int)(1e9 + 7));
	    }

	    public double sum(TreeNode node){
	        if(node == null) return 0;
	        return node.val + sum(node.left) + sum(node.right);
	    }

	    public double dfs(TreeNode node){
	        if(node == null)    return 0 ;
	        nodeSum = node.val + dfs(node.left) + dfs(node.right);
	        ans = Math.max(ans, (allSum - nodeSum) * nodeSum);
	        return nodeSum;
	    }



}
