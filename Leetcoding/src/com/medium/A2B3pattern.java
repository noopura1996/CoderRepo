package com.medium;

public class A2B3pattern {

	public static void main(String[] args) {
		//String input = "aaaabbcccccdd";		
		//String output = solution1(input);
		String input = "a4b2c5d2";
		String output = solution2(input);
		System.out.println(output);
	}

	private static String solution2(String input) {
		StringBuilder sb = new StringBuilder();
		int n = input.length();
		for(int i=0;i<n;++i) {
			if(Character.isAlphabetic(input.charAt(i))){
				sb.append(input.charAt(i));
			} else {
				int a = Character.getNumericValue(input.charAt(i));
					for(int j=1;j<a;++j) {
						sb.append(input.charAt(i-1));
					}
				}
			}
		return sb.toString();
		}
	
			
	

	private static String solution1(String input) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		int n = input.length();
		for(int i=0;i<n;++i) {
			if(i+1< n && input.charAt(i) == input.charAt(i+1)) {
				count++;				
			}
			else {
				sb.append(input.charAt(i)).append(count);
				count = 1;
			}
		}
		return sb.toString();
	}

}
