package BATJ.BaiDu;

import java.util.HashMap;

public class Joffer39 {

    public static int majorityElement(int[] nums) {
    	HashMap<Integer, Integer> lineHashMap = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
			if (!lineHashMap.containsKey(nums[i])) {
				lineHashMap.put(nums[i], 1);
			}else {
				lineHashMap.put(nums[i],  lineHashMap.get(nums[i])+1 );
				if (lineHashMap.get(nums[i])  > nums.length/2) {
					return nums[i];
				}
			}
		}
    	return 0;
    }
    public static void main(String[] args) {
    	int[] nums = new int[] {2,2,1,1,1,2,2};
    	System.out.println(majorityElement(nums));
	}
}
