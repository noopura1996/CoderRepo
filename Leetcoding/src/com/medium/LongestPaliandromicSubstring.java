package com.medium;

public class LongestPaliandromicSubstring {

	static boolean isPali(String str) {
		for(int i = 0, j = str.length()-1;i<str.length();++i,--j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "cbbd";
		int maxLength = 1;
		String maxStr = str.substring(0,1);
		for(int i = 0; i< str.length();++i) {
			for(int j =i+maxLength;j<=str.length();++j) {
				if(j-i>maxLength && isPali(str.substring(i,j))) {
					maxLength = j-i;
					maxStr = str.substring(i,j);
				}
			}
		}
		System.out.println(maxStr);
	}

}
