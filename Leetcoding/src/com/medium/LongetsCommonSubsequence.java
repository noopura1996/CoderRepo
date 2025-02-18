package com.medium;

public class LongetsCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "ace";
		int lenOfLOngestSubSeq = solution(s1,s2);
		System.out.println(lenOfLOngestSubSeq);

	}

	private static int solution(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m+1][n+1];
		for(int i=m;i>=0;--i)
			dp[i][n] = 0;
		for(int j=n;j>=0;--j)
			dp[m][j] = 0;
		for(int i=m-1;i>=0;--i) {
			for(int j=n-1;j>=0;--j) {
				if(s1.charAt(i) == s2.charAt(j))
					dp[i][j] = 1+dp[i+1][j+1];
				else
					dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
			}
		}
		return dp[0][0];
	}

}
