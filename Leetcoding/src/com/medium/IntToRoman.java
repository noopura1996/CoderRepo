package com.medium;

public class IntToRoman {

	public static void main(String[] args) {
		
		    int num = 3749;//output = MMMDCCXLIX
		        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		        final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

		        StringBuilder sb = new StringBuilder();

		        for (int i = 0; i < values.length; ++i) {
		            if (num == 0)
		                break;
		            while (num >= values[i]) {
		                sb.append(symbols[i]);
		                num -= values[i];
		            }
		        }

		        System.out.println( sb.toString());        
		    }
		

	

}
