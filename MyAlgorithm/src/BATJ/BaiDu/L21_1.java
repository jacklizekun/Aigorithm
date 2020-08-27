package BATJ.BaiDu;

public class L21_1 {

	 public int[] exchange(int[] nums) {
		 int slow = 0 , fast = 0;
		 while (fast < nums.length) {
			if((nums[fast] & 1) == 1) {
				 if (slow != fast) {
	                    nums[slow] ^= nums[fast];
	                    nums[fast] ^= nums[slow];
	                    nums[slow] ^= nums[fast];
	                }
				 slow++;
			}
			 fast++;
		}
		 return nums;
	 }
}
