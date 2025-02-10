package com.easy;

import java.util.Stack;

public class ValidParanthesis {
//stack  - LIFO
	static Boolean isValid(String str) {
		Stack<Character> stack = new Stack<Character>();
		for ( char c: str.toCharArray()) {
			if(c == '(')
				stack.push(')');
			else if(c == '{')
				stack.push('}');
			else if(c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop()!=c ) { //pop retrieves last elt from stack
				return false;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		//String input = "(){}[]";// "({)}[]";wrong input as Open brackets must be closed in the correct order.
		
		String input = "({)}[]";
		Boolean vaild = isValid(input);
		System.out.println("Valid or not "+vaild);

	}

}
