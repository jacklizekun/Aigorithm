package BATJ.BaiDu;

public class L69 {
    public static int mySqrt(int x) {
    	  if (x == 0) {
              return 0;
          }
          int ans = (int)Math.exp(0.5 * Math.log(x));
          return (long)(ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }
    public static void main(String[] args) {
		int x = 2147395600;
		System.out.println(mySqrt(x));
	}
}
