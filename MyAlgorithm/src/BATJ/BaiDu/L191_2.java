package BATJ.BaiDu;

public class L191_2 {

	// nn 和 n - 1n−1 与运算总是能把 nn 中最低位的 11 变成 00 ，并保持其他位不变
	public static int hammingWeight(int n) {
	    int sum = 0;
	    while (n != 0) {
	        sum++;
	        n &= (n - 1);
	    }
	    return sum;
	}

	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;
		System.out.println(hammingWeight(n));
	}

}
