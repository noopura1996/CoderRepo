package com.hard;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		String input = "aaaa";
		String pattern = "aaa*";
		System.out.println(Pattern.matches(pattern, input));
	}

}
