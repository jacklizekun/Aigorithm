package BATJ.BaiDu;


public class L62 {
	   public static int uniquePaths(int m, int n) {
		   	int[][] path = new int[n][m];
		   	path[n-1][m-1] = 1;
		   	for (int i = n - 2; i != -1; i--) {
				path[i][m - 1] = path[i + 1][m - 1 ] ;
			}
			for (int i = m - 2; i != -1 ;i--) {
				path[n - 1][i] = path[n - 1][i + 1] ;
			}
			
			for (int i = n - 2; i >  - 1; i -- ) {
				for (int j = m - 2; j > -1 ; j-- ) {
					path[i][j] = path[i + 1][j] + path[i][j + 1];
				}
			}
			return path[0][0];
	  }
	   public static void main(String[] args) {
		int n = 3;
		int m = 7;
		System.out.println(uniquePaths(m,n));
	}
}
