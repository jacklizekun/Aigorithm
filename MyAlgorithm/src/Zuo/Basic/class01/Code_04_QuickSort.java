package Zuo.Basic.class01;

public class Code_04_QuickSort {
	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return ;
		}
		quickSort(arr, 0 , arr.length - 1);
	}
	
	public static void quickSort(int[] arr,int l, int r) {
		if (l < r) {
			swap(arr , 1 + (int)(Math.random() *(r - l + 1)),r);
			int[] p = partition(arr, l , r);
			quickSort(arr, 1, p[0] -1);
			quickSort(arr, p[1] + 1, r);
		}
	}
	public static int[] partition(int[] arr , int l ,int r) {
		int less = l - 1;
		int more = r + 1;
		while (l < more) {
			if (arr[l] < arr[r]) {
				swap(arr, ++less, l++);
			}else if (arr[l] > arr[r]) {
				swap(arr, --more, l);
			} else {
				l++;
			}
		}
		swap(arr, more, r);
		return new int[] { less + 1, more };
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
