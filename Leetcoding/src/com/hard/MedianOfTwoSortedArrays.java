package com.hard;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] m = {1,2};
		int[] n = {3};
		double median = 0.0;
		int[] merged = new int[m.length+n.length];
		for(int i =0;i<m.length;++i) {
			merged[i] = m[i];
		}
		for(int j = 0,k = m.length;j<n.length;++j,++k) {
				merged[k] = n[j];
		}
		Arrays.sort(merged);
		if(merged.length%2 !=0) {
			median = (merged[(merged.length)/2]);
		}
		else {
			System.out.println(merged[(merged.length/2) - 1]+" "+merged[(merged.length)/2]);
			median = (merged[(merged.length/2) - 1]+merged[(merged.length)/2])/2.0;
		}
		System.out.println(median);
	}
}
