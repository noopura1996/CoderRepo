package com.medium;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {
		String input = "III"; //ouptut = 3
		//String input = "LVIII";//output = 58
		int output = 0;
		Map<Character,Integer> roman = new HashMap<>();
		roman.put('I', 1);
		roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
		 for(int i =0;i<input.length()-1;++i) {
			 if(roman.get(input.charAt(i))<roman.get(input.charAt(i+1))){
				 output-=roman.get(input.charAt(i));
			 }
			 else {
				 output+=roman.get(input.charAt(i));
			 }
		 }
System.out.println(output+roman.get(input.charAt(input.length()-1)));
	}

}
