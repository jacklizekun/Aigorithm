package BATJ.BaiDu;

public class L215_3 {

		 public static int findKthLargest(int[] nums, int k) {
			 k = nums.length - k;
			 int left = 0,right = nums.length - 1;
			while (left <= right) {
				int i = left;
				for (int j = left + 1; j < nums.length; j++) {
					if (nums[j] < nums[right]) {
						swap(nums, j , ++i);
					}
				}
				swap(nums, i , right);
				if (k == i) {
					return nums[i];
				}else if(k < i) {
					right = i - 1;
				}else {
					left = i + 1;
				}
			}
			return -1;
		}
		 public static void swap(int[] nums, int i , int right) {
			 nums[i] = nums[i] ^ nums[right];
			 nums[right] = nums[i] ^ nums[right];
			 nums[i] = nums[i] ^ nums[right];
		 }
		 public static void main(String[] args) {
				int[] nums = new int[] {3,2,1,5,6,4};
				int k = 2;
				System.out.println(findKthLargest(nums,k));
				System.out.println("=============================");
				int[] nums2 = new int[] {3,2,3,1,2,4,5,5,6};
				int k2 = 4;
				findKthLargest(nums2,k2);
			}
}
