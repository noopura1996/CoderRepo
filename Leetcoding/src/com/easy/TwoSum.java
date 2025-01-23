package com.easy;

/*Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, 
and you may not use the same element twice.*/
public class TwoSum {

	public static void main(String[] args) {
		//int[] nums = {2,7,15,14};
		int[] nums = {3,2,4};
		int target = 6;
		 int[] output = new int[2];
	        for(int i = 0;i<nums.length-1;++i){
	            for(int j = i+1;j<nums.length;++j){
	                if(nums[j] + nums[i] == target ){
	                    output[0] = i;
	                    output[1] = j;
	                }
	            } 
	        }
	        System.out.println(output[0]+" "+output[1]);
	}

}
