package BATJ.BaiDu;

import java.util.Arrays;

/**
 *
 * 
 215. 数组中的第K个最大元素
 
 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

示例 1:

输入: [3,2,1,5,6,4] 和 k = 2
输出: 5
示例 2:

输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
输出: 4
说明:

你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。


 * @author lizk27
 *
 */

public class L215 {
	 public static  int findKthLargest(int[] nums, int k) {
		 	Arrays.sort(nums);
		 	int len = nums.length;
		 	System.out.println(nums[len - k]);
			 return nums[len - k];
	  }
	 
	 public static void main(String[] args) {
		int[] nums = new int[] {3,2,1,5,6,4};
		int k = 2;
		findKthLargest(nums,k);
		System.out.println("=============================");
		int[] nums2 = new int[] {3,2,3,1,2,4,5,5,6};
		int k2 = 4;
		findKthLargest(nums2,k2);
	}
}
