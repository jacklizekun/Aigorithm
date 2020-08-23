package LeetCode;

import java.net.MalformedURLException;
import java.util.HashMap;

public class L1_1 {
	 public static int[] twoSum(int[] nums, int target) {
		 int length = nums.length;
		 HashMap<Integer, Integer> myHashMap = new HashMap<Integer, Integer>();
		 
		 for (int i = 0; i < length; i++) {
			if (myHashMap.containsKey(target - nums[i])) {
				
				return  new int[] {myHashMap.get(target - nums[i]),i};
			}else {
				myHashMap.put(nums[i], i);
			}
		}
		 throw new IllegalArgumentException("No two sum solution");
	 }
	 
	 public static void main(String[] args) {
			int[] nums = new int[] {2, 7, 11, 15};
			int target = 9;
			int[] res = twoSum(nums, target);
			System.out.println(res[0]);
			System.out.println(res[1]);
		}
}
