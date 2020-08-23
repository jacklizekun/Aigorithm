package Zuo.Basic.class01;

public class Code_08_NetherlandsFlag {
	public static int[] partition(int[] arr, int l, int r, int p) {
		int more = r + 1;
		int less = l - 1;
		while (l < more) {
			if (arr[l] < p) {
				swap(arr,++less, l++);
			}else if(arr[l] > p){
				swap(arr,--more, l++);
			}else {
				l++;
			}
		}
		return new int[] { less + 1, more - 1 };
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	public static void main(String[] args) {
		int[] test = new int[] {0 , 1, -1, 1, 2};
		int[] res = partition(test, 0, test.length - 1, 1);
		System.out.println(res[0]);
		System.out.println(res[1]);

	}
}
