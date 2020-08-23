package LeetCode;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class L1 {
	 public static int[] twoSum(int[] nums, int target) {
	     Arrays.sort(nums);
	     int a = 0;
	     int b = nums.length - 1;
	     int[] res = new int[2];
	     while (a != b ) {
			if (nums[a] + nums[b] > target) {
				 b--;
			}else if(nums[a] + nums[b] < target) {
				a++;
			}else {
				res[0] = a;
				res[1] = b;
				 return res;
			}
		}
	     return res;
	 }
	 public static void main(String[] args) {
		int[] nums = new int[] {2, 7, 11, 15};
		int target = 9;
		int[] res = twoSum(nums, target);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
}
