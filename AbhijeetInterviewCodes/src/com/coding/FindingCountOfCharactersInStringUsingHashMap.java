package com.coding;

import java.util.HashMap;
import java.util.Map;

public class FindingCountOfCharactersInStringUsingHashMap {
	public static void main(String[] args) {
		String str = "sahil shashikant pawar";
		
		String replaceAll = str.replaceAll(" ", "");
		
		
		char[] charArray = replaceAll.toCharArray();
		
		Map<Character, Integer> m = new HashMap<>();
		
		for (char c : charArray) {
			Integer integer = m.get(c);
			
			if(integer==null) {
				m.put(c, 1);
			}else {
				m.put(c, integer+1);
			}
		}
		System.out.println(m);
	}
}
