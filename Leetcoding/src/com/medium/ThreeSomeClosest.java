package com.medium;

import java.util.Arrays;

public class ThreeSomeClosest {

	public static void main(String[] args) {
		int[] arr = {-1,2,1,-4};
		//int[] arr = {0,0,0};
		int target = 1;
		int threesumValue = getThreeSumValue(arr,target);
		System.out.println("threesumValue"+threesumValue);
	}

	static int getThreeSumValue(int[] arr, int target) {
		Arrays.sort(arr);
		int sum =0;
		int constant = Integer.MAX_VALUE/2;
		
		for( int i=0;i<arr.length;i++) {
			int j=i+1;
			int k=arr.length-1;
			while(j<k) {
				sum =arr[i]+arr[j]+arr[k];
				if(Math.abs(sum-target)<Math.abs(constant-target)){
					constant = sum;
				}
				if(sum<target)
					++j;
				else if(sum>target)
					--k;
				else {
					return sum;
				}
			}
		}
		return constant;

	}

}
