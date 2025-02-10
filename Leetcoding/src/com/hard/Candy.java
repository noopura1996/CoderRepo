package com.hard;

public class Candy {

	public static void main(String[] args) {
		int[] ratings = {1,2,87,87,87,2,1};
		int minCandies = solution(ratings);
		System.out.println(minCandies);
	}

	private static int solution(int[] ratings) {
		int n = ratings.length;
		int[] candies = new int[n];
		int minCandies = 0;
		//initialize all candies to 1
		for(int i=0;i<n;++i) {
			candies[i] = 1;
		}
		//left traversal
		for(int i=1;i<n-1;++i) {
			if(ratings[i] > ratings[i-1])
				candies[i] = candies[i-1]+1;
		}
		
		//right traversal
		for(int i=n-2;i>=0;--i) {
			if(ratings[i] > ratings[i+1])
				candies[i] = Math.max(candies[i],candies[i+1]+1);
		}
		for(int i=0;i<candies.length;++i) {
			minCandies+=candies[i];
		}
		return minCandies;
	}

}
