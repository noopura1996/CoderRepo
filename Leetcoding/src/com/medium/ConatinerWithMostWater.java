package com.medium;

public class ConatinerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int left = 0;
		int maxArea = 1;
		int right = height.length-1;		
		while(left<right) {
			int currentArea = (Math.min(height[left], height[right])*(right-left));
			maxArea = Math.max(maxArea, currentArea);
			if(height[left]>height[right])
				right--;
			else
				left++;
		}
		System.out.println(maxArea);
	}

}
