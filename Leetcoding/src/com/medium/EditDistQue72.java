package com.medium;

public class EditDistQue72 {

	public static void main(String[] args) {
		String s1 = "horse";
		String s2  ="ros";
		int minDist = solution(s1,s2);
		System.out.println(minDist);
	}

	private static int solution(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m+1][n+1];
		for(int j = n;j>=0;--j  )
			dp[m][j] = n-j;
		for(int i = m;i>=0;--i)
			dp[i][n] = m-i;
		for(int i = m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {					
				if(s1.charAt(i) == s2.charAt(j))				
					dp[i][j] = dp[i+1][j+1];
				else {
					dp[i][j] = 1+Math.min(dp[i+1][j+1], Math.min(dp[i+1][j], dp[i][j+1]));
				}
					
			}
		}
		for(int i =0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		return dp[0][0];
	}

}
