package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrapletSum {

	public static void main(String[] args) {
		int[]  nums = {1,0,-1,0,-2,2};
		Arrays.sort(nums);
		int length = nums.length;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0;i<length-3;++i){
			if(i>0&&nums[i]==nums[i-1]) 
				continue;
				for(int j =i+1;j<length-2;++j) {
					if(j>i+1 && nums[j]==nums[j-1]) 
						continue;
						int k =j+1;
						int l = length-1;
						while(k<l) {
							 long sum = nums[i] + nums[j];
			                    sum += nums[k] + nums[l];
							if(sum == 0) {
								list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
								 k++;
			                     l--;
			                     while (k < l && nums[k - 1] == nums[k]) 
			                    	 k++;			                        
			                     while (k < l && nums[l + 1] == nums[l]) 
			                    	 l--;
		                    } else if (sum < 0)
			                        k++;
			                 else 
			                        l--;
							}
						}
					}
		System.out.println(list);
				}
}


