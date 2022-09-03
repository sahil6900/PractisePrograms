package com.coding;

import java.util.HashMap;
import java.util.Map;

public class FindingCountOfWordsUsingHashmap {
	public static void main(String[] args) {
		String str = "I love my India India is my Country";
		
		String[] split = str.split(" ");
		
		Map<String, Integer> m = new HashMap<>();
		
		for (String string : split) {
			Integer integer = m.get(string);
			
			if(integer==null) {
				m.put(string, 1);
			}
			else {
				m.put(string, integer+1);
			}
		}
		System.out.println(m);
	}
}
