package com.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	 static void generateParenthesis(int n) {
	        List<String> res = new ArrayList<String>();
	        recurse(res, 0, 0, "", n);
	        System.out.println(res);
	    }
	    
	    static void recurse(List<String> res, int left, int right, String s, int n) {
	        if (s.length() == n * 2) {
	            res.add(s);
	            return;
	        }
	        
	        if (left < n) {
	            recurse(res, left + 1, right, s + "(", n);
	        }
	        
	        if (right < left) {
	            recurse(res, left, right + 1, s + ")", n);
	        }
	    }
	    
	public static void main(String[] args) {
		int n = 3;
		generateParenthesis(n);

	}
	
	   
		// See above tree diagram with parameters (left, right, s) for better understanding
	

}
