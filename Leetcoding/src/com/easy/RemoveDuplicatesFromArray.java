package com.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	static void removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		for(int k = 0;k<arr.length;++k) {
			System.out.print(" "+arr[k]+" ");
		}
		System.out.println(arr.length);
		int[] output = new int[arr.length];
		int count = 1;
		int j = 0;
		for(int i = 0;i<arr.length-1;++i) {
			
			if(arr[i] != arr[i+1]) {
				
				++count;
				
			}
		}
		System.out.print(count);
		/*for(int k = 0;k<arr.length;++k) {
			System.out.print(" "+output[k]+" ");
		}*/
	}
	public static void main(String[] args) {
		int[] arr = {1,4,3,7,68,34,4,78,68,90,34,7};
		removeDuplicates(arr);
	}

}
