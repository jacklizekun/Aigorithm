package BATJ.BaiDu;
/**
 * 快排
 * @author lizk27
 *
 */
public class L215_2 {
	 public static int findKthLargest(int[] nums, int k) {
		 //从前数第几个，例如1中第一个下标为0
		 k = nums.length - k;
		 int left = 0, right = nums.length - 1;
		 while (left <= right) {
			int i = left;//左边界
			for (int j =  left + 1; j <= right; j++) {
				if (nums[j] < nums[right]) {
					 swap(nums, j, ++i);//把小于右侧边界都移动到左侧
				}
			}
			//将最右侧和i交换
			swap(nums, right, i);
			if (k == i)
                return nums[i];
            else if (k < i)
                right = i - 1;
            else
                left = i + 1;
		   }
		 	return -1;
		
		
		}
		 
		 
	 private static void swap(int[] nums, int i, int j) {
	        if (i != j) {
	            nums[i] ^= nums[j];
	            nums[j] ^= nums[i];
	            nums[i] ^= nums[j];
	        }
	    }

	 
	 public static void main(String[] args) {
			int[] nums = new int[] {3,2,1,5,6,4};
			int k = 2;
			System.out.println(findKthLargest(nums,k));
			System.out.println("=============================");
			int[] nums2 = new int[] {3,2,3,1,2,4,5,5,6};
			int k2 = 4;
			System.out.println(findKthLargest(nums,k));
		}
}
