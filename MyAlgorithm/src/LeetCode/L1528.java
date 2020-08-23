package LeetCode;

import java.util.Arrays;
import java.util.HashMap;


public class L1528 {

    public String restoreString(String s, int[] indices) {
        int length = indices.length;
        char[] ss = new char[length];
        for (int i = 0; i < ss.length; i++) {
        	ss[indices[i]] = s.charAt(i);
		}
        return (ss.toString());
    }
}