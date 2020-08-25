package BATJ.BaiDu;

public class L5_1 {
	private static String addBoundaries(String s,char divide) {
		int len = s.length();
		if(len == 0) {
			return "";
		}
		if(s.indexOf(divide) != -1) {
			  throw new IllegalArgumentException("参数错误，您传递的分割字符，在输入字符串中存在！");
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < len; i++) {
			stringBuilder.append(divide);
			stringBuilder.append(s.charAt(i));
		}
		stringBuilder.append(divide);
		return stringBuilder.toString();
	}

	private static int centerSpread(String s,int center) {
		int len = s.length();
		int i = center - 1;
		int j = center + 1;
		int step = 0;
		while (i >= 0 && j < len && s.charAt(i) == s.charAt(j)) {
			i--;
            j++;
            step++;
		}
		return step;
	}
	
	public static String longestPalindrome(String s) {
		int len = s.length();
		if (len < 2) {
			return s;
		}
		String str = addBoundaries(s, '#');
		int sLen = 2*len + 1;
		int maxLen = 1;
		int start = 0;
		for (int i = 0; i < sLen; i++) {
			int curLen = centerSpread(str, i);
			if (curLen > maxLen) {
				maxLen =curLen;
				start = (i - maxLen)/2;
			}
		}
		return s.substring(start,start + maxLen);
	}
	   public static void main(String[] args) {
			String string = "abae3";
			System.out.println(longestPalindrome(string));
		}
}
