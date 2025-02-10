package com.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

	static String getLongestPrefix(String[] s) {
		StringBuilder prefix = new StringBuilder();
		StringBuilder suffix = new StringBuilder();
		Arrays.sort(s);
		String first = s[0];
		String last = s[s.length-1];
		for (int i=0;i<Math.min(first.length(), last.length());i++) {
			if(first.charAt(i)==last.charAt(i)) {
				prefix.append(first.charAt(i));
			}
			else
				return prefix.toString();
		}
		//code for common suffix
		/*for (int i=first.length()-1, j=last.length()-1;i>=0 && j>=0;i--,j--) {
			if(first.charAt(i)==last.charAt(j)) {
				suffix.append(first.charAt(i));
			}
			else
				return suffix.toString();
		}
		StringBuilder suf= suffix.reverse();*/
		return prefix.toString();
		
	}
	public static void main(String[] args) {
		//String[]strs = {"flower","flow","flight"};
		String[]strs = {"dogcar","racecar","car"};
		String prefix = getLongestPrefix(strs);
		System.out.println("Longest common prefix is "+prefix);
	}

}
