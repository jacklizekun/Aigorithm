package Zuo.Basic.class01;
import java.util.List;
import java.util.ArrayList;
public class Code_10_GetAllNotIncluded {
	public static List<Integer> comparator(int[] A, int[] B){
		List<Integer> res = new ArrayList<>();
		for(int i = 0 ; i < B.length ; i ++) {
			boolean contains = false;
			for(int j = 0 ; j < A.length ; j ++) {
				if(A[j] ==  B[i]) {
					contains = true;
					break;
				}
			}
			if (!contains) {
				res.add(B[i]);
			}
		}
		return res;
	}
	
	public static List<Integer> GetAllNotIncluded(int[] A, int[] B) {
		List<Integer> res = new ArrayList<>();
		for(int i = 0 ; i < B.length ; i ++) {
			int l = 0;
			int r = A.length - 1;
			boolean contains = false;
			while(l <= r) {
				int mid = l + (r - l) >> 1;
				if(A[mid] > B[i]) {
					r = mid - 1;
				}else if(A[mid] < B[i]) {
					l = mid + 1;
				}else {
					contains = true;
					break;
				}
			}
			if (!contains) {
				res.add(B[i]);
			}
		}
		return res;
	}
}
