package BATJ.BaiDu;


public class L191 {

    public static int hammingWeight(int n) {
    	int Count = 0;
        int index = 31;
        while (index != -1) {
			if (((n >> index) & 1) == 1) {
				Count ++;
			}
			index -- ;
		}
        //System.out.println(Count);
        return Count;
    }
    public static void main(String[] args) {
		int n = 00000000000000000000000000001011;
		hammingWeight(n);
	}
}
