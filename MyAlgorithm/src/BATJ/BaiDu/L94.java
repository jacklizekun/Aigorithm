package BATJ.BaiDu;

import java.util.ArrayList;
import java.util.List;
/**
 * 给定一个二叉树，返回它的中序 遍历。

示例:

输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [1,3,2]
进阶: 递归算法很简单，你可以通过迭代算法完成吗？

 * @author lizk27
 *
 */
public class L94 {

	public static class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
	}
	
	public static List<Integer> inorderTraversal(TreeNode root){
		List<Integer> resList = new ArrayList<Integer>();
		inorder(root,resList);
		
		return resList;
    }
	public static void inorder(TreeNode root,List<Integer> resList) {
		if (root == null) {
			return ;
		}
	
		 inorder(root.left,resList);
		 resList.add(root.val);
		 inorder(root.right,resList);
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode right = new TreeNode(2);
		TreeNode left= new TreeNode(3);
		root.right = right;
		right.left = left;
		List<Integer> myList = inorderTraversal(root);
		while (!myList.isEmpty()) {
			System.out.println(myList.toString());
			
		}
		
	}
}
