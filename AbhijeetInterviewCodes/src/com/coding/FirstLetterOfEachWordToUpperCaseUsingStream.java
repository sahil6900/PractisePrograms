package com.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLetterOfEachWordToUpperCaseUsingStream {
	public static void main(String[] args) {
		
		String str = "SAHIL SHASHIKANT PAWAR";
		
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			String lowerCase = split[i].toLowerCase();
			
			String substring = lowerCase.substring(0, 1);
			
			String upperCase = substring.toUpperCase();
			
			String substring2 = lowerCase.substring(1, lowerCase.length());
			
			System.out.println(upperCase+substring2);
	
			
		}
		
		String[] split2 = str.split(" ");
		
		List<String> list = new ArrayList<>();
		
		for (String string : split2) {
			list.add(string);
		}
			
		List<String> collect = list.stream().map(first->first.substring(0, 1).toUpperCase()+first.substring(1, first.length()).toLowerCase()).collect(Collectors.toList());
		
		System.out.println(collect);
		
		

	}
}
