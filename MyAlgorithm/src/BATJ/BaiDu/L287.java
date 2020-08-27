package BATJ.BaiDu;

public class L287 {
	public int findDuplicate(int[] nums) {
		   int n = nums.length;
		   int l = 1, r = n - 1, ans = -1;
		   while (l <= r) {
			   	int mid = (l + r) >> 1;
		   		int cnt = 0;
		   		for (int i = 0; i < nums.length; i++) {
		   			if (nums[i] <= mid) {
						cnt ++;
					}
		   		}
		   		
		   		if (cnt < mid) {
					l = mid + 1;
				}else {
					r = mid - 1;
					ans = mid;
				}
		   }
		   return ans;
	  }
}
