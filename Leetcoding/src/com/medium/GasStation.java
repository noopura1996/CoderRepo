package com.medium;

public class GasStation {

	public static void main(String[] args) {
		int[] gas = {7,1,0,11,4};
		int[] cost = {5,9,1,2,5};
		int index = solution(gas,cost);
		System.out.println(index);
	}

	private static int solution(int[] gas, int[] cost) {
		int n = gas.length;
		int total = 0;
		int current = 0;
		int index = 0;
		for(int i=0;i<n;++i) {
			total += gas[i]-cost[i];
			current +=gas[i]-cost[i];
			if(current<0) {
				current = 0;
				index = i+1;
			}
		}
		return (total<0) ? -1 : index;
		//gas[0]-cost[0]+gas[1] < cost[1]
		
	}

}
