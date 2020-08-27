package BATJ.BaiDu;

public class Joffer51 {

	 public int reversePairs(int[] nums) {
		 int cnt = 0;
		 int len = nums.length;
		 for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (nums[i] > nums[j]) {
					cnt ++;
				}
			}
		}
		 return cnt;
	 }
}
