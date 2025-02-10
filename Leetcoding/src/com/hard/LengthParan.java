package com.hard;
import java.util.*;
public class LengthParan {

	public static void main(String[] args) {
		String s = "((()))(((()))(())";
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		int index = 0;
		int maxLength = 0;
		while(index!= s.length()) {
			if(s.charAt(index) == '('){
				stack.push(index);
			}
			else if(s.charAt(index) == ')'){
					stack.pop();
					if(stack.isEmpty())
						stack.push(index);
					else
						maxLength = Math.max(maxLength, index-stack.peek());
			}
			if(s.charAt(index) == '(' || s.charAt(index) == ')')
				index++;
		}
		System.out.println(maxLength);
	}
}
