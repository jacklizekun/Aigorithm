package BATJ.BaiDu;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import BATJ.BaiDu.L94.TreeNode;


public class L94_1 {
		public static class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;
			TreeNode(int x) { val = x; }
		}
	  public static List<Integer> inorderTraversal(TreeNode root) {
		  Stack < TreeNode > stack = new Stack < > ();
		  List<Integer> resList = new ArrayList<Integer>();
		  TreeNode curr = root;
		  while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			resList.add(curr.val);
			curr = curr.right;
		}
		 return resList;
	  }
	  public static void main(String[] args) {
			TreeNode root = new TreeNode(1);
			TreeNode right = new TreeNode(2);
			TreeNode left= new TreeNode(3);
			root.right = right;
			right.left = left;
			List<Integer> myList = inorderTraversal(root);
			System.out.println(myList.toString());	
			
		}
}
