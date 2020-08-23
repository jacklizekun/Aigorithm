package LeetCode;

public class L26 {
	public static int removeDuplicates(int[] nums) {
		int length = nums.length;
		int index = 0;
		if (length <= 1) {
			return length;
		}
		for (int i = 1; i != length; i++) {
            
			if (nums[index] != nums[i]) {
				int tmp = nums[i];
				nums[++index] = tmp;
				nums[i] = nums[index];
			}
		}
		return index + 1;
    }
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,1,2};
		System.out.println(removeDuplicates(nums));
	}
}
