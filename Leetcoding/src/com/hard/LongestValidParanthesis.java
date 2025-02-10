package com.hard;

import java.util.Stack;

public class LongestValidParanthesis {

	public static int getLength(String str) {
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		int index=0;
		int max_len = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
							
				if (str.charAt(i) == '(') {
					sb.append(str.charAt(i));
					stack.push(index);
				} else if (str.charAt(i) == ')'){
					stack.pop();
					if (stack.isEmpty()) {
						stack.push(index);
					} else {
						sb.append(str.charAt(i));//wrong
						max_len = Math.max(max_len, index - stack.peek());
					}
				} 
				if (str.charAt(i) == '(' || str.charAt(i) == ')') {
					index ++;
				}
				
				//System.out.println("Valid "+sb.toString());

		}
		
		return max_len;

	}

	public static void main(String[] args) {
		String str = "((abc))())()";
		 //String str = ")(abc)())";
		int s = 0;
		try {
			s = getLength(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Output" + s);
	}
}
