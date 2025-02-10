package com.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
//Length of Longest Substring Without Repeating Characters
	public static void main(String[] args) {
		String str = "abcabcbb";
		int maxlength = 0;
		int start = 0;
		Map<Character,Integer> hMap = new HashMap<>();
		
		for(int i =0;i<str.length();++i) {
			char c = str.charAt(i);
			//check whether character is repeating then start variable will point to the next character 
			//for example in abcabcbb when a repeats check starts from b
			if(hMap.containsKey(c) && hMap.get(c)>= start) {
				start = hMap.get(c)+1;
			}
			hMap.put(c, i);
			//maxlength is length of non repeating characters
			maxlength = Math.max(maxlength, i-start+1);
		}
		System.out.println(maxlength);
	}

}
