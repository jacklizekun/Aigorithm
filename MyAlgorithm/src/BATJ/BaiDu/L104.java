package BATJ.BaiDu;



public class L104 {

	 public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 public static int maxDepth(TreeNode root) {
		 int index = max(root, 0);
		 System.out.println(index);
		 return index;
	  }
	 public static int  max(TreeNode root, int index) {
		 if (root == null) {
			return 0;
		}
		 index = Math.max(max(root.right, index)+ 1,max(root.left, index)+ 1 );
		 return index;
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
