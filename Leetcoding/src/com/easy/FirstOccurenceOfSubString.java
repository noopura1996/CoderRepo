package com.easy;

public class FirstOccurenceOfSubString {

	public static void main(String[] args) {
		String haystack = "sadbutsadtsa";
		String needle = "tsa";
		int j = needle.length();
		for(int i =0;i<haystack.length()-j+1;++i) {
			String str = haystack.substring(i,i+j);
			//System.out.println(str);
			if(str.equalsIgnoreCase(needle)) {
				System.out.println(i);
				break;
			}
		}
		

	}

}
