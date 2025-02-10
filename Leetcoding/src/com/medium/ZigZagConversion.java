package com.medium;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int rows = 3;
		int index = 0;
		int direction = 0;
		if(rows == 1 || s.length()>=rows) {
			System.out.println(s);
		}
		//store one row in arraylist
		List<Character>[] list  = new ArrayList[rows];
		for(int i = 0;i<rows;++i) {
			list[i] = new ArrayList<>();
		}
		for(char c : s.toCharArray()) {
			list[index].add(c);
			if(index == 0) {
				direction = 1;
			}else if (index == rows-1) {
				direction = -1;
			}
			index+=direction;
		}
		StringBuilder sb = new StringBuilder();
		for(List<Character> row : list) {
			for(char c : row) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
