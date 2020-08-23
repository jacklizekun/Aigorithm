package LeetCode;

public class L880 {
	   public static String decodeAtIndex(String S, int K) {
		   char[] ss = S.toCharArray();
		   StringBuilder stringBuilder = new StringBuilder();
		   for (int i = 0; i != ss.length; i++) {
			   if (Character.isDigit(ss[i])) {
				   int j = ss[i] - '0';
				   int j2 = 1;
				   String string = stringBuilder.toString();
				  while(j2 != j) {
					   stringBuilder.append(string);
					   j2++;
				   }
			   }
			   else {
				stringBuilder.append(ss[i]);
			}
			   
		   }
		  char res = stringBuilder.toString().charAt(K -1);
		  
		  return String.valueOf(res);
	 }
	   public static void main(String[] args) {
		   String S = "leet2code3";
		   int K = 10;
		   System.out.println(decodeAtIndex(S,K));
	}
	   
}
