package com.medium;

import java.util.*;

public class LongestConsecutiveSubSequence {

	public static void main(String[] args) {
		//int[] arr = {100,4,200,1,3,2};
		int[] arr = {0,3,7,2,5,8,4,6,0,1};
		//int length = solution1(arr);
		int length = solution2(arr);
		System.out.println(length);
	}

	private static int solution2(int[] arr) {
		int longest = 0;
		int length;
		Set<Integer> set = new HashSet<>();//Set.copyOf(Arrays.asList(arr));
		for(int n : arr)
			set.add(n);
	    for(int n : arr) {
	    	if(!set.contains(n-1)) {
	    		length = 1;
	    		while(set.contains(n+length)) {
	    			length+=1;
	    		}
	    		longest = Math.max(longest, length);
	    	}
	    }
				
		return longest;
	}
	

	

	

	private static int solution1(int[] arr) {
		int count = 0;
		Arrays.sort(arr); //O(nlogn)
		for(int i=0;i<arr.length-1;++i) {
			if(arr[i+1] == arr[i]+1)
				count++;
		}
		return count+1;
	}

}
