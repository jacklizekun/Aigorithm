package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L1441 {
	public List<String> buildArray(int[] target, int n) {
		int index = 0;
		int i = 1;
		List<String> res = new ArrayList<String>();
		while (index != target.length) {
			if (target[index] != i) {
				res.add("Push");
				res.add("Pop");
			}else {
				res.add("Push");
				index ++;
			}
			i ++;
		}
		return res;
    }
}
