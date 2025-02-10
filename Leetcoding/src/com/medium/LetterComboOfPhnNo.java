package com.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterComboOfPhnNo {

	//based on loop method one easy but more than two not possible hence we use recursion
	static List<String> getCombo(Map<Character, String>digitToLetters,String digits) {
		int length = digits.length(); 
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		int i=0;		
		while (i!=length-1) {
			String str = digitToLetters.get(digits.charAt(i));
			 for (char letter : str.toCharArray()) {
				 
				 String strnew = digitToLetters.get(digits.charAt(i+1));
				 for (char letternew : strnew.toCharArray()) {
					 sb.setLength(0);
					 sb.append(letter);
					 sb.append(letternew);					 
					 list.add(sb.toString());
					 
				 }
				 
			 }
			 i++;
		}
		
		return list;
		
	}
	
	static List<String> getCombos(){
		 Map<Character, String> digitToLetters = new HashMap<>();
	        digitToLetters.put('2', "abc");
	        digitToLetters.put('3', "def");
	        digitToLetters.put('4', "ghi");
	        digitToLetters.put('5', "jkl");
	        digitToLetters.put('6', "mno");
	        digitToLetters.put('7', "pqrs");
	        digitToLetters.put('8', "tuv");
	        digitToLetters.put('9', "wxyz");
	        String digits = "673";
	        List<String> list = new ArrayList<String>();
	        if (digits == null || digits.length() == 0) {
	            return list;
	        }		
		
		usingRecursion(digitToLetters,digits,0,new StringBuilder(),list);
		
		return list;

	}
	
	static void usingRecursion(Map<Character, String>digitToLetters,String digits, int index, StringBuilder sb, List<String> list) {
		if(index==digits.length()) {
			list.add(sb.toString());
			return;
			
		}	
		String str = digitToLetters.get(digits.charAt(index));
		 for (char letter : str.toCharArray()) {			
				 sb.append(letter);
				 usingRecursion(digitToLetters,digits,index+1,sb,list);	
				 sb.deleteCharAt(sb.length()-1);
			 }
			
		 }
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list = getCombos();
		System.out.println("Combo list is "+ list.toString());
	}
	
	/*public static void main(String[] args) {
			Map<Character, String> digitToLetters = new HashMap<>();
	        digitToLetters.put('2', "abc");
	        digitToLetters.put('3', "def");
	        digitToLetters.put('4', "ghi");
	        digitToLetters.put('5', "jkl");
	        digitToLetters.put('6', "mno");
	        digitToLetters.put('7', "pqrs");
	        digitToLetters.put('8', "tuv");
	        digitToLetters.put('9', "wxyz");
	        String digits = "673";
	        List<String> list = new ArrayList<String>();
	        list = getCombo(digitToLetters,digits);
	        System.out.println("Combo list is "+ list.toString());
	}*/

}
