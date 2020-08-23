package LeetCode;

public class L1446 {
	 public int maxPower(String s) {
		 int length = s.length();
		 int maxindex = 0;
		 int jumax = 0;
		 int index = 0;
		 while (index < length) {
			if (s.charAt(index) == s.charAt(index + 1)) {
				jumax++; index++;
				maxindex = jumax > maxindex ? jumax  : maxindex;
			}else {
				index ++;
			}
		}
		 return maxindex;
	 }
}
