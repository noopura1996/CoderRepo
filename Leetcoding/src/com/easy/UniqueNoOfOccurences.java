package com.easy;

import java.util.*;
public class UniqueNoOfOccurences {

	public static void main(String[] args) {
		int[] arr = {1,2,2,1,1,3};
		boolean isUnique = solution(arr);
		System.out.println(isUnique);
	}

	private static boolean solution(int[] arr) {
		Map<Integer,Integer> hMap = new HashMap<>();
		for(int num : arr) {
			hMap.put(num, hMap.getOrDefault(num, 0)+1);
		}
		Set<Integer> set = new HashSet<>(hMap.values()); 
		if(set.size() == hMap.size())
			return true;
		return false;
	}

}
