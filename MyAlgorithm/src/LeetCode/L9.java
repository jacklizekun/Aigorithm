package LeetCode;

public class L9 {
	public static boolean isPalindrome(int x) {
		int mx = x;
		if (mx < 0) {
			return false;
		}
		int res = 0;
		while ( mx != 0) {
			int pop = mx % 10;
			mx /= 10;
			res = res*10 + pop;
		}
		if (res == x) {
			return true;
		}else {
			return false;
		}
    }
	public static void main(String[] args) {
		int x = 10;
		System.out.println(isPalindrome(x));
	}
}
