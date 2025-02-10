package com.medium;

import java.util.ArrayList;
import java.util.List;

public class PaliandromePartitioning {

	public static void main(String[] args) {
		String str = "abbab" ;
		List<List<String>> list = solution(str);
		System.out.println(list.toString());
	}

	private static List<List<String>> solution(String str) {
		List<List<String>> list = new ArrayList<>();
		backtrack(list,new ArrayList<>(),0,str);
		return list;
		
	}

	private static void backtrack(List<List<String>> list, ArrayList<String> arrayList, int start, String str) {
		if(start == str.length())
			list.add(new ArrayList<>(arrayList));
		else {
			for(int i=start;i<str.length();++i) {
				if(isPaliandrome(str,start,i)) {
					arrayList.add(str.substring(start, i+1));
					backtrack(list,arrayList,i+1,str);
					arrayList.remove(arrayList.size()-1);
				}
			}
		}
		
	}

	private static boolean isPaliandrome(String substring, int start, int end) {
		while(start<end) {
			if(substring.charAt(start++) != substring.charAt(end--))
				return false;
		}
		return true;
	}

}
