package BATJ.BaiDu;

import java.util.PriorityQueue;

public class L215_1 {
	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();
		for (int i = 0; i < nums.length; i++) {
			myPriorityQueue.offer(nums[i]);
		}
		int index = 0;
		while(index != nums.length - k ) {
			myPriorityQueue.poll();
			index ++;
		}
		//System.out.println(myPriorityQueue.poll());
		return myPriorityQueue.poll();
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
