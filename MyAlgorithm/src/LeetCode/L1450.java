package LeetCode;

public class L1450 {
	 public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		 int res = 0;
		 	for (int i = 0; i < endTime.length; i++) {
				if (startTime[i] < queryTime && endTime[i] > queryTime) {
					res ++;
				}
			}
		 	
		 	return res;
	 }
}
