package BATJ.BaiDu;

import java.util.HashSet;

public class L268_1 {
	public static int missingNumber(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < nums.length ; i++) {
			hashSet.add(nums[i]);
		}
		
		for (int i = 0; i < nums.length + 1; i++) {
			if (!hashSet.contains(i)) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = new int[] {3,0,1};
		System.out.println(missingNumber(nums));
		int[] num = new int[] {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(num));
	}

}
