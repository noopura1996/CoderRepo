package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumZero {

	public static void main(String[] args) {
		int sum = 0;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		//int[] arr = {-1,0,1,2,-1,-4};
		int[] arr= {0,0,0};
		Arrays.sort(arr);//[-4,-1,-1,0,1,2]
		for (int i=0;i<arr.length;i++) {	
			if(i>0 && arr[i]==arr[i-1]) {//simultaneous numbers are same then skip loop
				continue;
			}
			int j=i+1;
			int k=arr.length-1;
			while(j<k) {
				sum = arr[i]+arr[j]+arr[k];
				 if (sum > 0) {
	                    k--;
	                } else if (sum < 0) {
	                    j++;
	                } else {
	                    list.add(Arrays.asList(arr[i], arr[j], arr[k]));
	                    j++;
	                    while (arr[j] == arr[j-1] && j < k) {//simultaneous numbers are same then skip loop
	                        j++;
	                    }		
	                }
			}
		}
		System.out.println("List is " +list.toString());
	}
}
