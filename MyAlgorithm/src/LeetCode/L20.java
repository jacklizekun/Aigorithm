package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class L20 {
	  public static boolean isValid(String s) {
		  int length = s.length();
		  HashMap<Character, Character> kuoHashMap  = new HashMap<Character, Character>(){
			  {
				 put(')','(');
				 put(']','[');
				 put('}','{');
			  }
		  };
		  
		  Stack<Character> stack = new Stack<Character>();
		  stack.push('1');
 		  for (int i = 0; i < length; i++) {
 			  char a = s.charAt(i);
			if ( kuoHashMap.containsKey(a) && stack.peek() != kuoHashMap.get(a) ) {
				return false;
			}else{
				stack.pop();
				stack.push(a);
			}
		}
 		 return true;
	  }
	  public static void main(String[] args) {
		  System.out.println(isValid("{[]}"));
	  }
}
