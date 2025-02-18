package com.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PaliandromePartiotion2hard {	

		public static void main(String[] args) {
			String str = "abbab" ;
			//int minCut = solution(str);
			//solution2
			int minCut = minCut(str);
			System.out.println(minCut);
		}

		private static int solution(String str) {
			int min = Integer.MAX_VALUE;
			List<Integer> list = new ArrayList<>();
			backtrack(list,new ArrayList<String>(),0,str);
			for(int num : list) {
				min = Math.min(num, min);
			}
			return min-1; //cut = size - 1
			
		}

		  private static void backtrack(List<Integer> list, ArrayList<String> arrayList, int start, String str) {
			if(start == str.length())
				list.add(new ArrayList<>(arrayList).size());
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
		
		public static int minCut(String s) {
	        // validate input
	        if (s == null || s.length() <= 1) {
	            return 0;
	        }
	        // dp
	        int N = s.length();
	        int[] dp = IntStream.range(0, N).toArray(); // initial value: dp[i] = i

	        for (int mid = 1; mid <  N; mid++) { // iterate through all chars as mid point of palindrome
	            // CASE 1. odd len: center is at index mid, expand on both sides
	            for (int start = mid, end = mid; start >= 0 && end < N && s.charAt(start) == s.charAt(end); start--, end++) {
	                int newCutAtEnd = (start == 0) ? 0 : dp[start - 1] + 1;
	                dp[end] = Math.min(dp[end], newCutAtEnd);
	            }
	            // CASE 2: even len: center is between [mid-1,mid], expand on both sides
	            for (int start = mid - 1, end = mid; start >= 0 && end < N && s.charAt(start) == s.charAt(end); start--, end++) {
	                int newCutAtEnd = (start == 0) ? 0 : dp[start - 1] + 1;
	                dp[end] = Math.min(dp[end], newCutAtEnd);
	            }
	        }
	        return dp[N - 1];
	    }

	}

		