package BATJ.BaiDu;

public class L268_2 {
	 public static int missingNumber(int[] nums) {
		 int res  = nums.length;
		 for (int i = 0; i < nums.length; i++) {
			res ^= i ^ nums[i];
		}
		 return res;
	 }
		public static void main(String[] args) {
			int[] nums = new int[] {3,0,1};
			System.out.println(missingNumber(nums));
			int[] num = new int[] {9,6,4,2,3,5,7,0,1};
			System.out.println(missingNumber(num));
		}
}
