package BATJ.BaiDu;

public class L69_1 {
	 public static int mySqrt(int x) {
		 int l = 0 , r = x , ans = -1;
		 if (x == 0) {
	            return 0;
	        }
		 while(l < r) {
			 int mid = (r - l)/2 + l;
			 if ((long)mid * mid <= x) {
				ans = mid;
				l = mid + 1;
			}else {
				r = mid - 1;
			} 
		 }
		 
		 return ans;
	 }
	 public static void main(String[] args) {
			int x = 2147395600;
			System.out.println(mySqrt(x));
		}
}
