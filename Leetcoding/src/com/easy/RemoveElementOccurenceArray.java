package com.easy;

import java.util.Arrays;

public class RemoveElementOccurenceArray {
	static void removeElementOccurence(int[] arr,int elt) {
		Arrays.sort(arr);
		int count = 0;
		for(int i = 0;i<arr.length;++i) {
			if(arr[i] != elt) {
				arr[count] = arr[i];
				count++;
			}
			
				
		}
		System.out.println(count);
		for(int k = 0;k<count;++k) {
			System.out.print(" "+arr[k]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,4,3,7,68,34,78,68,90,68,7,68,9};
		int elt = 68;
		removeElementOccurence(arr,elt);
	}

}
