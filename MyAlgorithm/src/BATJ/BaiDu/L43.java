package BATJ.BaiDu;

public class L43 {
/*
 *    ´íÎó×ö·¨
 */
	  public static String multiply(String num1, String num2) {
		   int lennum1 = num1.length() - 1;
		   int lennum2 = num2.length() - 1;
		   System.out.println(6/10);
		 /*
		   int index = 0;
		   StringBuilder stringBuilder = new StringBuilder();
		   while (lennum1 > -1 || lennum2 > -1|| index != 0 ) {
			   int sum = num1.charAt(lennum1) * num2.charAt(lennum2) + index;
			   index = sum / 10;
			   int countnum = sum % 10;
			   stringBuilder.append(countnum);
			   lennum1 --;
			   lennum2 --;
 		   }
		   //System.out.println(stringBuilder.toString());
		   return stringBuilder.toString();
		   */
		   return "";
	  }
	  public static void main(String[] args) {
		 String num1  =  "2";
		 String num2  =  "3";
		 multiply(num1,num2);
	  }
}
