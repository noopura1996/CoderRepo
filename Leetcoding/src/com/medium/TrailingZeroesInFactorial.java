package com.medium;

public class TrailingZeroesInFactorial {

	public static void main(String[] args) {
		int num = 20;
		int count = solution(num);
		System.out.println(count);
	}

	private static int solution(int num) {
		if(num<0) {
			return -1;
		}
		int count = 0;
		for(int i=5;num/i>=1;i*=5) {
			count+=num/i;
		}
		return count;
	}

}
