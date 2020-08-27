package BATJ.BaiDu;

public class L53 {

	 public static int maxSubArray(int[] nums) {
		 if (nums == null) {
			return Integer.MIN_VALUE;
		}
		 int length = nums.length;
		 int[] dp = new int[length];
		 dp[0] = nums[0];
		 int max = nums[0];
	    for (int i = 1; i < length; i++) {
			if (dp[i - 1] <= 0) {
				dp[i] = nums[i];
			}else {
				dp[i] = dp[i - 1] + nums[i];
			}
			max = max > dp[i] ? max : dp[i];
		}
	    System.out.println(max);
	    return max;
	 }
	 
	 public static void main(String[] args) {
		 int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		 
		maxSubArray(nums);
	}
}
